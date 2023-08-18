package com.mzcms.controller;

import com.mzcms.commin.lang.Result;
import com.mzcms.entity.Login;
import com.mzcms.entity.User;
import com.mzcms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;

//@RestController会自动帮一个对象转换成json的格式
@RestController
@RequestMapping("/mzcmsapi/user")
public class UserController {
    @Autowired
    private UserService userService;
    // 注册用户
    @RequestMapping("/createUser")
    public Result createUsers(@RequestBody @Valid User user, BindingResult errors) {
        if (errors.hasErrors()) {
            return Result.fail(errors.getFieldError().getDefaultMessage());
        }
        return userService.createUser(user);
    }
    // 获取用户列表
    @RequestMapping("/getUserList")
    public List<User> getUserList(){
        return userService.findAllUserList();
    }
    // 用户登录
    @RequestMapping("/login")
    public Result login(Login login){
        return  userService.login(login);
    }
}
