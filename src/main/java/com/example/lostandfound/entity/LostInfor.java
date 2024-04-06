package com.example.lostandfound.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "LostInfor")
public class LostInfor  implements Serializable {
    @Id
    @Column(name = "lostID")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String lostID;

    @Column(name = "name", length = 40)
    //标题
    private String name;

    @Column(name = "picturename")
    //照片名称
    private String pictureName;

    @Column(name = "lostcontent")
    // 失物招领简介
    private String lostContent;

    @Column(name = "category")
    // 类别
    private String category;

    @Column(name = "releasedate")
    private String releaseDate;

    @Column(name = "isfound", columnDefinition = "tinyint(1) unsigned DEFAULT '0'")
    private Integer isFound;

    @Column(name = "ownerID")
    private String ownerID;

    @Column(name="publisher",nullable = false)
    private String publisher;
}
