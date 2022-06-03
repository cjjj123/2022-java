package com.cjj.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/6/2
 * Time:17:02
 */
public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "MVC");
        modelAndView.setViewName("hello");
        System.out.println("hahahahaa");
        return modelAndView;
    }
}
