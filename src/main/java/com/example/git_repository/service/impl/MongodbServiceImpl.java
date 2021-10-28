package com.example.git_repository.service.impl;

import com.example.git_repository.entity.Spit;
import com.example.git_repository.service.MongoDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaoyu
 * @version 1.0
 * @date 2021/10/28 11:39
 */
@Service
public class MongodbServiceImpl implements MongoDBService {
 /*   @Autowired
    private IdWorker idWorker;*/

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<Spit> getALlSpit() {
        return mongoTemplate.findAll(Spit.class);
    }
}
