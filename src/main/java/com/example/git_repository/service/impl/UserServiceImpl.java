package com.example.git_repository.service.impl;

import com.example.git_repository.dao.UserDao;
import com.example.git_repository.entity.SysUser;
import com.example.git_repository.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zhaoyu
 * @version 1.0
 * @date 2021/10/27 9:18
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public List<SysUser> getAllUser() {
        return userDao.findAll();
    }
}
