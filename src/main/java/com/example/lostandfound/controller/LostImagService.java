package com.example.lostandfound.controller;
public class LostImagService {}
//
//import com.example.lostandfound.entity.LostImag;
//import com.example.lostandfound.repo.LostImagRepository;
//import jakarta.annotation.Resource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.UUID;
//
//@Service
//public class LostImagService {
//
//    @Autowired
//
//    @Resource
//    private LostImagRepository lostImagRepository;
//
//    // 假设有一个目录用于存储上传的图片
//    private static final String UPLOAD_DIR = "uploads/";
//    public LostImag createLostImag(String name, String category, String lostcontent, MultipartFile picturename, String ownerID) {
//        // 创建LostImag实体并设置属性
//        LostImag lostImag = new LostImag();
//        lostImag.setName(name);
//        lostImag.setCategory(category);
//        lostImag.setLostcontent(lostcontent);
//        lostImag.setOwnerID(ownerID);
//
//        // 设置日期为当前日期
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        String currentDate = sdf.format(new Date());
//        lostImag.setReleasedate(currentDate);
//
//        // 处理上传的文件
//        if (!picturename.isEmpty()) {
//            try {
//                // 生成一个唯一的文件名，避免重复
//                String originalFilename = picturename.getOriginalFilename();
//                String uniqueFilename = UUID.randomUUID().toString() + "_" + originalFilename.substring(originalFilename.lastIndexOf('.'));
//                Path path = Paths.get(UPLOAD_DIR + uniqueFilename);
//                Files.write(path, picturename.getBytes());
//                lostImag.setPicturename(uniqueFilename);
//            } catch (IOException e) {
//                e.printStackTrace();
//                // 处理文件上传失败的情况
//                // 这里可以记录日志、返回错误信息给用户等
//            }
//        } else {
//            // 没有上传文件，这里可以处理相应逻辑，比如抛出异常或返回错误信息
//        }
//
//        // 保存实体到数据库
//        return lostImagRepository.save(lostImag);
//    }
//}