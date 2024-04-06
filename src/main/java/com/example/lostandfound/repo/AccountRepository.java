package com.example.lostandfound.repo;

import com.example.lostandfound.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//使用实体类，CRUD操作
@Repository
public interface AccountRepository extends JpaRepository<Account,Integer> {

}
