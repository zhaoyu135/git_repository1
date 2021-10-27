package com.example.git_repository.service;

import com.example.git_repository.entity.SysUser;

import java.util.List;

/**
 * @author zhaoyu
 * @version 1.0
 * @date 2021/10/27 9:18
 */
public interface UserService {
    List<SysUser> getAllUser();

}
