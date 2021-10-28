package com.example.git_repository.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * @author zhaoyu
 * @version 1.0
 * @date 2021/10/28 11:29
 */
@Data
public class Spit implements Serializable {
    @Id
    private String _id;
    private String content;
    private String userid;
    private String nickname;
    private Integer visits;

}
