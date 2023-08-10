package com.mzcms.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class TestController {
    @RequestMapping("/")
    public String handle01(){
        return  "hello,java";
    }
}
