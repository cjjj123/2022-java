package com.cjj.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * cookie传递众问
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/9
 * Time:16:32
 */
public class CookieDemo03 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 解决中文乱码
        req.setCharacterEncoding("GBK");
        resp.setCharacterEncoding("GBK");

        // 简单输出
        PrintWriter out = resp.getWriter();

        // cookie，服务器端聪客户端获取
        // 可能cookie存在多个
        Cookie[] cookies = req.getCookies();

        // 判断cookie是不存在
        if(cookies != null){
            // 存在cookie
            out.write("上一次访问的时间是：");
            // 遍历cookie
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                // 获取cookie的名字
                String name = cookie.getName();
                if("name".equals(name)){
                    String value = cookie.getValue();
                    System.out.println(value);
                    out.write(value);
                }
            }
        }else{
            out.write("这是你第一次访问");
        }


        Cookie cookie = new Cookie("name", "张智霖");
        resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
