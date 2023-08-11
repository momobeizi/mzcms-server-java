package com.mzcms.controller;

import com.mzcms.entity.Users;
import com.mzcms.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController会自动帮一个对象转换成json的格式
@RestController
@RequestMapping("/mzcmsapi/users")
public class UserController {
    @Autowired
    private UsersService usersService;
    // 注册用户
    @RequestMapping("/addUsers")
    public String  addUsers() {return  usersService.addUsers();}
    // 获取用户列表
    @RequestMapping("/getUsersList")
    public List<Users> getUsersList(){
        return usersService.findAllUsers();
    }
}
