package com.mzcms.service;

import com.mzcms.entity.User;
import com.mzcms.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

// @Service的意思是将其实例化,
//之前如果有一个class，是不是需要new一个对象才可以用，
//这里就可以理解成会自动帮你new，new完了之后，将实例加到了spring容器当中
@Service
public class UserService {
    //引进UserMapper,@Autowired的意思就是将其实例化，通过autowired从spring容器中拿出来，供我们使用
    @Autowired
    private UserMapper userMapper;

    //查询账号是否存在
    public User findUser(){

    }

    //查询所有用户
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }
}
