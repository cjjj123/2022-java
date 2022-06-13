package com.cjj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/6/13
 * Time:14:05
 */
//在template目录下的所有页面，只能通过controller来跳转
//同时需要模板引擎的支持 thymeleaf
@Controller
public class IndexController {


    @GetMapping("/login")
    public String index(){
        return "index";
    }
}
