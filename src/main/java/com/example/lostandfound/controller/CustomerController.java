package com.example.lostandfound.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test") //路由注册
@RestController   //  ResponseBody+Controller
public class CustomerController {

    @RequestMapping("hi")
    public String  sayHi(String name){
        //访问地址 http://localhost:8080/test/hi?name=username
        return "hi,spring,"+name;
    }
}
