package com.example.lostandfound.entity;
// 此表为学习JPA用表，创建表

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "account")
public class Account {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "username")
    String username;
    @Column(name = "password")
    String password;
}
