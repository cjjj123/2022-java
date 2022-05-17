package com.cjj.servlet;

import com.cjj.pojo.User;
import com.cjj.service.user.UserService;
import com.cjj.service.user.UserServiceImpl;
import com.cjj.util.Constants;

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
 * Date:2022/5/12
 * Time:16:05
 */
public class LoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("LoginServlet--start--开始登录");
        String userCode = req.getParameter("userCode");
        String password = req.getParameter("password");
        UserService userService = new UserServiceImpl();
        User user = userService.login(userCode, password);
        if(user != null){
            System.out.println("用户存在");
            // 将用户的信息放到session
            HttpSession session = req.getSession();
            session.setAttribute(Constants.USER_SESSION, user);
            // 跳转到主页（重定向）
            resp.sendRedirect("jsp/frame.jsp");
        }
        // 用户不存在
        else{
            System.out.println("用户不存在");
            req.setAttribute("error","用户名或者密码不正确");
            // 转发
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
