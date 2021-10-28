package com.example.git_repository.controller;

import com.example.git_repository.entity.Spit;
import com.example.git_repository.service.MongoDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhaoyu
 * @version 1.0
 * @date 2021/10/28 11:37
 */
@RestController
public class MongoDBController {
    @Autowired
    private MongoDBService mongoDBService;

    @GetMapping("mongo")
    public List<Spit> getSpitList(){
       return mongoDBService.getALlSpit();
    }


}
