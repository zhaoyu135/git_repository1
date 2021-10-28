package com.example.git_repository.service;

import com.example.git_repository.entity.Spit;

import java.util.List;

/**
 * @author zhaoyu
 * @version 1.0
 * @date 2021/10/28 11:40
 */
public interface MongoDBService {
    List<Spit> getALlSpit();
}
