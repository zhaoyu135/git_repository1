package com.example.git_repository.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

/**
 * @author zhaoyu
 * @version 1.0
 * @date 2021/10/27 9:54
 */
@Controller
public class TaskController {
    //@Scheduled(cron="0/2 * * * * ?")
    public void task(){
        System.out.println("你好");
    }

}
