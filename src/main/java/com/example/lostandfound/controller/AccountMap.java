package com.example.lostandfound.controller;

import com.example.lostandfound.entity.Account;
import com.example.lostandfound.repo.AccountRepository;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/account") //路由注册
@RestController   //  ResponseBody+Controller 返回的不是页面是数据 返回页面时候不用ResponseBody注解

public class AccountMap {
    // JPA使用实体类Account
    @Resource
    AccountRepository accountRepository;
    @RequestMapping("mytest")
    public String acco(){
        Account account = new Account();
        account.setUsername("admin");
        account.setPassword("12346");
        System.out.print(accountRepository.save(account));

        String c = accountRepository.findAll().toString();

        return "数据库操作成功 " + c;
    }

}
