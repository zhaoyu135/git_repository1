package com.example.git_repository.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaoyu
 * @version 1.0
 * @date 2021/10/26 17:10
 */
@Controller
public class ThymeleafController {

    @RequestMapping("index")
    public String test1(Model model){
        model.addAttribute("msg","啦啦啦");
        return "hello";

    }

}
