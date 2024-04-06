package com.example.lostandfound.controller;

//import com.example.lostandfound.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RequestMapping("/myTestUser") //路由注册
@RestController   //  ResponseBody+Controller 返回的不是页面是数据 返回页面时候不用ResponseBody注解
public class UserMap {
    /*@RequestMapping("user")
    public String allUsers(User user){
        return user.getName();
//        return user.toString();
    }*/

    @RequestMapping("/login/{username}/{password}")
    public String login(@PathVariable("username") String username,@PathVariable("password") String password){
        // 获取URL(baseURL)中直接获取参数@PathVariable
        return username+":"+password;
    }

    //文件上传

    @RequestMapping("/upfile")
    public String upfile(@RequestPart("myfile") MultipartFile file) throws IOException{
        String path = "D:\\Pictures\\联想锁屏壁纸\\8531095.jpg";
        file.transferTo(new File(path));
        return path;
    }
    @RequestMapping("/myupfile")
    public String myupfile(@RequestPart("myfile") MultipartFile file) throws IOException{
        String path = "D:\\Pictures\\";
        // 根目录+唯一的文件名
        path+= UUID.randomUUID().toString();
        // 根目录+唯一的文件名+文件后缀
        path+= file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        file.transferTo(new File(path));
        return path;
    }
    // 请求重定向+转发 return “redirect/forward:index.html”
}
