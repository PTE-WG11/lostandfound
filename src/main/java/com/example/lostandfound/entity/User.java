package com.example.lostandfound.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Data
@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id
    @Column(name = "nameID")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String nameID;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "grade")
    // private String classField; // 注意：class是Java关键字，所以使用classField代替
    private String grade;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "wechat")
    private String wechat;

    @Column(name = "password", columnDefinition = "varchar(255) DEFAULT '123456'")
    private String password; // 注意：使用columnDefinition来设置默认值

    @Column(name = "points", columnDefinition = "int(255) DEFAULT '0'")
    private Integer points;

    @Column(name = "isable", columnDefinition = "tinyint(1) unsigned DEFAULT '1'")
    private Integer isable;

    // 省略getter和setter方法...

    // 可以根据需要添加toString()、hashCode()和equals()方法
}
/*注意以下几点：
    @Entity注解表示这是一个JPA实体类。
    @Table注解指定了实体类对应的数据库表名。
    @Id和@Column注解分别用于标识主键和映射普通字段。
    由于class是Java的关键字，因此我将它重命名为classField。
    如果字段有默认值，可以使用columnDefinition属性来设置默认值。
*/