package com.mzcms.controller;

import com.mzcms.entity.Users;
import com.mzcms.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController会自动帮一个对象转换成json的格式
@RestController
public class UserController {
    @Autowired
    private UsersService usersService;

    //@RequestMapping("/getUsersList")的意思告诉前端相应的地址访问
    @RequestMapping("/getUsersList")
    public List<Users> getUsersList(){
        return usersService.findAllUsers();
    }
}
