package com.example.lostandfound.repo;


import com.example.lostandfound.entity.LostImag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//创建实体类接口，CRUD操作，在C中使用
@Repository
public interface LostImagRepository extends JpaRepository<LostImag,String> {
    // 这里可以定义一些自定义的查询方法，如果需要的话
    /*Spring Boot会为您实现这个接口，并提供基本的CRUD操作。
    您可以在服务层（Service Layer）中注入这个Repository，并使用它来进行数据库操作。
     */
}