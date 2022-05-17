package com.cjj.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/9
 * Time:17:34
 */
public class SessionDemo01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 解决乱码问题
        req.setCharacterEncoding("GBK");
        resp.setCharacterEncoding("GBK");
        resp.setContentType("text/html;charset=GBK");

        // 获取session
        // 浏览器一打开，session就存在了
        HttpSession session = req.getSession();
        // 存东西
        session.setAttribute("name",new Person("张智霖", 20));
        // 获取session的id
        String id = session.getId();

        // 判断是不是新的session
        if(session.isNew()){
            resp.getWriter().write("session创建成功，sessionID为：" + id);
        }else{
            resp.getWriter().write("session已存在了，sessionID为：" + id);
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
