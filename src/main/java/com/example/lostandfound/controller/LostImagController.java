package com.example.lostandfound.controller;
public class LostImagController {}
//
//
//import com.example.lostandfound.entity.LostImag;
//import jakarta.annotation.Resource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//@RestController
//@RequestMapping("/api")
//public class LostImagController {
//
//    @Autowired
//    @Resource
//    private LostImagService lostImagService;
//
//    @PostMapping("/upload")
//    public ResponseEntity<?> uploadLostImag(@RequestParam("name") String name,
//                                            @RequestParam("category") String category,
//                                            @RequestParam("lostcontent") String lostcontent,
//                                            @RequestParam("picturename") MultipartFile picturename,
//                                            @RequestParam("ownerID") String ownerID) {
//        try {
//            LostImag lostImag = lostImagService.createLostImag(name, category, lostcontent, picturename, ownerID);
//            return ResponseEntity.ok(lostImag);
//        } catch (Exception e) {
//            // 处理异常，返回错误信息
//            return ResponseEntity.badRequest().body("Error uploading lost image: " + e.getMessage());
//        }
//    }
//}