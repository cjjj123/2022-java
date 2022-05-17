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
 * cookie
 *
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/9
 * Time:15:22
 */
public class CookieDemo01 extends HttpServlet {

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
                if("latLoginTime".equals(name)){
                    String value = cookie.getValue();
                    long latLoginTime = Long.parseLong(value);
                    Date date = new Date(latLoginTime);
                    out.write(date.toLocaleString());
                }
            }
        }else{
            out.write("这是你第一次访问");
        }

        // 服务器给客户端响应cookie
        Cookie cookie = new Cookie("latLoginTime", System.currentTimeMillis() + "");
        // 设置cookie有效期
        cookie.setMaxAge(24*60*60);
        resp.addCookie(cookie);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
