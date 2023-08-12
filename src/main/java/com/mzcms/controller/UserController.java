package com.mzcms.controller;

import com.mzcms.entity.User;
import com.mzcms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController会自动帮一个对象转换成json的格式
@RestController
@RequestMapping("/mzcmsapi/user")
public class UserController {
    @Autowired
    private UserService userService;
    // 注册用户
    @RequestMapping("/addUser")
    public String  addUser() {return  userService.addUser();}
    // 获取用户列表
    @RequestMapping("/getUserList")
    public List<User> getUserList(){
        return userService.findAllUser();
    }
}
