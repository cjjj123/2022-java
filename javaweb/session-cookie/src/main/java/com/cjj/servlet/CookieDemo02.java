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
 * 删除cookie
 *
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/9
 * Time:15:22
 */
public class CookieDemo02 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 服务器给客户端响应cookie
        Cookie cookie = new Cookie("latLoginTime", System.currentTimeMillis() + "");

        cookie.setMaxAge(0);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
