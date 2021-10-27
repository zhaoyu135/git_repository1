package com.example.git_repository.service.impl;

import com.example.git_repository.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author zhaoyu
 * @version 1.0
 * @date 2021/10/26 15:24
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "你好";
    }
}
