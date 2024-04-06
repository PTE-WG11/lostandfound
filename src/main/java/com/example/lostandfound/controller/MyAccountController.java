package com.example.lostandfound.controller;

import com.example.lostandfound.dto.UserForm;
import com.example.lostandfound.entity.User;
import com.example.lostandfound.repo.UserRepository;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.validation.Valid;

@Controller
public class MyAccountController {

    @Autowired
    private UserRepository userRepository;

//    构造器注入（推荐）：
//    @Autowired
//    private void Myuser(UserRepository userRepository){this.userRepository=userRepository;}
    @GetMapping("/user/{nameId}")
    public String userProfile(@PathVariable String nameId, Model model) {
        // 根据UUID获取用户信息
        User user = userRepository.findById(nameId).orElse(null);
        if (user == null) {
            // 用户不存在，返回错误页面或重定向到其他地方
            return "index"; // 替换为实际的错误处理逻辑
        }

        // 将用户信息添加到模型中
        model.addAttribute("user", user);


        // 返回个人主页视图
        return "user-profile";
    }






    @PostMapping("/user/{nameId}/update")
    public String updateUserProfile(@PathVariable String nameId,
                                    @Valid @ModelAttribute("userForm") UserForm userForm, BindingResult result) {
        if (result.hasErrors()) {
            // 如果有验证错误，将错误和表单数据添加到模型中并返回视图
            return "user-profile";
        }

        // 根据UUID查找用户
        User user = userRepository.findById(nameId).orElse(null);
        if (user == null) {
            // 用户不存在，返回错误页面或重定向
            return "error";
        }

        // 更新用户信息
        user.setName(userForm.getName());
        user.setGrade(userForm.getGrade());
        // ... 更新其他字段

        // 保存用户信息到数据库
        userRepository.save(user);

        // 重定向到用户主页，防止表单重复提交
        return "redirect:/user/" + nameId;


        /*BindingResult接口用于获取数据绑定和验证的结果。
        当Spring MVC尝试将请求参数绑定到UserForm对象时，
        它还会执行验证（如果@Valid注解被使用）。
        任何验证错误都会被收集到BindingResult对象中。
        你可以检查BindingResult对象是否有错误，
        并据此决定是继续处理请求还是返回错误信息给用户。*/
    }

}
