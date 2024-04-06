package com.example.lostandfound.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserForm {

    @NotNull(message = "id必须")
    private String id;

    @Size(min = 1, max = 10, message = "Grade must be between 1 and 10 characters")
    @NotNull(message = "Email is required")
    private String name;
    private String grade;
    // ... 其他字段

    // 构造器、getter和setter方法省略// 使用lombok自动生成
}
