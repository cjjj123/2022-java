package com.cjj.controller;

import com.cjj.pojo.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/6/3
 * Time:16:50
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","springMVC");
        return "hello";
    }


    @RequestMapping("/h1")
    public String h1(){
        System.out.println("转发1");
        return "/WEB-INF/jsp/hello.jsp";
    }

    @RequestMapping("/h2")
    public String h2(){
        System.out.println("转发2");
        return "forward:/WEB-INF/jsp/hello.jsp";
    }

    @RequestMapping("/h3")
    public String h3(){
        System.out.println("重定向");
        return "redirect:/index.jsp";
    }


    @RequestMapping("/h4")
    public void h4(String name){
        System.out.println(name);
    }

    @RequestMapping("/h5")
    public void h5(@RequestParam(value = "username",required = false) String name){
        System.out.println(name);
    }

    @RequestMapping("/h6")
    public void h6(User user){
        System.out.println(user.toString());
    }

    @ResponseBody // 该标签就不会走视图解析器，会直接返回一个字符串
    @RequestMapping(value = "/h7", produces = "application/json;charset=utf-8")
    public String json() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        User user = new User("张智霖","address","1");
        String string = mapper.writeValueAsString(user);
        return string;
    }





}
