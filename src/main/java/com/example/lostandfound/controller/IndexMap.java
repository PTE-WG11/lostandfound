package com.example.lostandfound.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("") //路由注册
//@RestController   //  ResponseBody+Controller
@Controller
public class IndexMap {
    @RequestMapping("/test")
    public String allUsers(){
//        return "这是主页面";
        return "/index.html";
    }



    @RequestMapping("")
    public String indexmap(){
        return "/index.html";
    }
}
