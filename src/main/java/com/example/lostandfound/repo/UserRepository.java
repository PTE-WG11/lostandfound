package com.example.lostandfound.repo;

import com.example.lostandfound.entity.Account;
import com.example.lostandfound.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//使用实体类，CRUD操作
@Repository
public interface UserRepository extends JpaRepository<User,String> {
    // 这里可以定义一些自定义的查询方法，如果需要的话

}
