package com.example.lostandfound;

import com.example.lostandfound.entity.LostImag;
import com.example.lostandfound.entity.User;
import com.example.lostandfound.repo.LostImagRepository;
import com.example.lostandfound.repo.UserRepository;
import com.example.lostandfound.utils.DateUtil;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class LostandfoundApplicationTests {

//    LostImagRepository lostImagRepository;
    @Resource
    UserRepository userRepository;
    @Autowired
    LostImagRepository lostImagRepository;


    @Test
    void contextLoads() {
        // JPA使用实体类User

       //新增加用户
        User user = new User();
        user.setGrade("二年级");
        user.setName("里1");
        user.setPhone("14000000000");
        user.setPassword("2sasc");
        user.setWechat("微信号");
        user.setPoints(0);
        user.setIsable(1);
        String d = userRepository.save(user).getNameID();;
        List<User> c = userRepository.findAll();
        System.out.print(d+c);

        // 信息发布+查询
        // 创建LostImag实体并设置属性
        LostImag lostImag = new LostImag();

        String name = "校园卡";
        String category = "校园卡";
        String lostcontent = "内有身份证和银行卡";
        MultipartFile picturename;
        String ownerID = "ccc";


        lostImag.setName("校园卡");  // 获取传入的内容
        lostImag.setPublisher("publisher");//上传时替换内容获取
        lostImag.setCategory(category); // 获取传入的内容
        lostImag.setLostContent(lostcontent);

        lostImag.setReleaseDate(DateUtil.getCurrentDateTimeAsString()); //上传时必写
        lostImag.setIsFound(0);  //上传时必写

        lostImag.setOwnerID(ownerID); //上传时为空

        lostImagRepository.save(lostImag);
    }

}
