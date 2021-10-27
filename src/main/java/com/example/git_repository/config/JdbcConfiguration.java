package com.example.git_repository.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


/**
 * @author zhaoyu
 * @version 1.0
 * @date 2021/10/26 16:28
 */
@Configuration
public class JdbcConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;

    }
}
