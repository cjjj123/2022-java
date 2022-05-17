package com.servlet;

import com.util.Contant;
import sun.nio.cs.US_ASCII;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 注销
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/11
 * Time:15:47
 */
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object user_session = req.getSession().getAttribute(Contant.USER_SESSION);
        if(user_session != null){
          req.getSession().removeAttribute(Contant.USER_SESSION);
          resp.sendRedirect("/login.jsp");
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
