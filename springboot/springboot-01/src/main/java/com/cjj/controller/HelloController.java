package com.cjj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/6/10
 * Time:15:42
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "哈哈";
    }

}
