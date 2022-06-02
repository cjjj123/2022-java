package com.cjj.config;

import com.cjj.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/30
 * Time:18:54
 */
@Configuration
@ComponentScan("com.cjj")
public class MyConfig {


    @Bean
    public User getUser(){
        return new User();
    }
}
