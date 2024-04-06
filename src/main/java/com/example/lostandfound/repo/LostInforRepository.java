package com.example.lostandfound.repo;

import com.example.lostandfound.entity.LostInfor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LostInforRepository extends JpaRepository<LostInfor,String>{
}

