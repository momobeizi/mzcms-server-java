package com.mzcms.service;

import com.mzcms.commin.lang.Result;
import com.mzcms.entity.Login;
import com.mzcms.entity.User;
import com.mzcms.mapper.UserMapper;
import com.mzcms.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

// @Service的意思是将其实例化,
//之前如果有一个class，是不是需要new一个对象才可以用，
//这里就可以理解成会自动帮你new，new完了之后，将实例加到了spring容器当中
@Service
public class UserService {
    //引进UserMapper,@Autowired的意思就是将其实例化，通过autowired从spring容器中拿出来，供我们使用
    @Autowired
    private UserMapper userMapper;

    public Integer findUserCount(User user){
        return  userMapper.findUserCount(user.getAccount());
    }

    //查询所有用户
    public List<User> findAllUserList() {
        return userMapper.findAllUserList();
    }

    //创建用户
    public Result createUser(User user){
        //检查账号是否重复
        Integer Count = findUserCount(user);
        if (Count >= 1){
            return Result.fail(("账号重复"));
        }
        //将密码进行md5进行加密
        user.setPassWord(MD5Utils.getMd5Simple(user.getPassWord()));
        //赋值初始时间
        LocalDateTime currentDateTime = LocalDateTime.now();
        user.setCreatedAt(currentDateTime);
        user.setUpdatedAt(currentDateTime);
        //判断是否有头像进行初始头像赋值
        if(user.getPicture()==null){
            user.setPicture("https://tse2-mm.cn.bing.net/th/id/OIP-C._fkebxLYwLZ1LaqmhEFlVgAAAA?pid=ImgDet&rs=1");
        }
        //进行插入数据操作
        Integer ResultCount = userMapper.insertUser(user);
        if(ResultCount==1){
            return Result.succ(200);
        }else {
            return Result.fail(("创建失败"));
        }

    }

    // 用户登录
    public Result login(Login login){
        System.out.println(login.getAccount());
        User loginUser =  userMapper.findUser(login.getAccount());
        System.out.println(loginUser.getAccount());
        return Result.succ(200);
    }


}
