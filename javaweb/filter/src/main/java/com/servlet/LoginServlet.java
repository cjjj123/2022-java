package com.servlet;

import com.util.Contant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 登录
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/11
 * Time:15:28
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取前端请求的参数
        String username = req.getParameter("username");
        // 登录成功
        if("admin".equals(username)){
            HttpSession session = req.getSession();
            session.setAttribute(Contant.USER_SESSION, session.getId());
            // 跳转到成功页面
            resp.sendRedirect("/sys/success.jsp");
        }
        // 登录失败
        else{
            resp.sendRedirect("/sys/error.jsp");
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
