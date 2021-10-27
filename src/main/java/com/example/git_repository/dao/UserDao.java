package com.example.git_repository.dao;

import com.example.git_repository.entity.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhaoyu
 * @version 1.0
 * @date 2021/10/26 17:40
 */
@Repository
public interface UserDao {
    List<SysUser> findAll();

}
