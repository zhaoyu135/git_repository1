package com.example.git_repository.controller;

import com.example.git_repository.entity.SysUser;
import com.example.git_repository.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
@Api(tags = "用户接口")
public class MybatisController {
    @Autowired
    private UserService userService;
    @GetMapping("users")
    @ApiOperation(value = "查询所有用户",notes = "查询")
    public List<SysUser> getAll(){
        return userService.getAllUser();

    }

}
