package com.example.git_repository.controller;

import com.alibaba.druid.pool.DruidDataSource;
import com.example.git_repository.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoyu
 * @version 1.0
 * @date 2021/10/26 14:42
 */
@RestController
public class HelloController {


    @Value("${jdbc.url}")
    private String url;


    @Autowired
    HelloService helloService;
   // @Autowired
    //private DruidDataSource dataSource;

    @GetMapping("hello")
    public String hello() {

        return helloService.hello();

    }
    @GetMapping("value")
    public String value() {

        return url;

    }
    @GetMapping("dataSource")
    public String dataSource() {
        //return dataSource.getUrl();
        return "";
    }

}
