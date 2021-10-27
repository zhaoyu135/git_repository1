package com.example.git_repository;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author zhaoyu
 */
@SpringBootApplication
@MapperScan("com.example.git_repository.dao")
@EnableScheduling
public class GitRepositoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitRepositoryApplication.class, args);
    }

}
