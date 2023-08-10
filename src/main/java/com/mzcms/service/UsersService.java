package com.mzcms.service;

import com.mzcms.entity.Users;
import com.mzcms.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

// @Service的意思是将其实例化,
//之前如果有一个class，是不是需要new一个对象才可以用，
//这里就可以理解成会自动帮你new，new完了之后，将实例加到了spring容器当中
@Service
public class UsersService {
    //引进UsersMapper,@Autowired的意思就是将其实例化，通过autowired从spring容器中拿出来，供我们使用
    @Autowired
    private UsersMapper usersMapper;

    //处理业务逻辑，这里由于业务过于简单，就空着，查询出什么我就返回什么
    public List<Users> findAllUsers() {
        return usersMapper.findAllUsers();
    }
}
