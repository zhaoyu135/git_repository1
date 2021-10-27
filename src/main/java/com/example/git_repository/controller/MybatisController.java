package com.example.git_repository.controller;

import com.example.git_repository.entity.SysUser;
import com.example.git_repository.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhaoyu
 * @version 1.0
 * @date 2021/10/26 17:44
 */
@RestController
public class MybatisController {
    @Autowired
    private UserService userService;
    @GetMapping("users")
    public List<SysUser> getAll(){
        return userService.getAllUser();

    }

}
