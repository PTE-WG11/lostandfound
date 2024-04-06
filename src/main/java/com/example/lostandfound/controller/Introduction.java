package com.example.lostandfound.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/introduction") //路由注册
@RestController   //  ResponseBody+Controller
public class Introduction {
    @RequestMapping("")
    public String introductionPage(){
        return "这是静态简介页面";
    }
}