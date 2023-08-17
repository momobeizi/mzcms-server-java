package com.mzcms.controller;

import com.mzcms.commin.lang.Result;
import com.mzcms.entity.User;
import com.mzcms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;
import java.util.List;

//@RestController会自动帮一个对象转换成json的格式
@RestController
@RequestMapping("/mzcmsapi/user")
public class UserController {
    @Autowired
    private UserService userService;
    // 注册用户
    @RequestMapping("/createUsers")
    public Result createUsers(@RequestBody @Valid User user, BindingResult errors) {
        if (errors.hasErrors()) {
            return Result.fail(errors.getFieldError().getDefaultMessage());
        }
        //检查账号是否重复
        Integer Count = userService.findUserCount(user);
        if (Count >= 1){
            return Result.fail(("用户名重复"));
        }
        return Result.succ(200);
    }
    // 获取用户列表
    @RequestMapping("/getUserList")
    public List<User> getUserList(){
        return userService.findAllUser();
    }
}
