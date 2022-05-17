package com.cjj.servlet;

import com.alibaba.fastjson.JSONArray;
import com.cjj.pojo.User;
import com.cjj.service.user.UserService;
import com.cjj.service.user.UserServiceImpl;
import com.cjj.util.Constants;
import com.mysql.jdbc.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/13
 * Time:11:03
 */
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("method");
        if("savepwd".equals(method)  && method != null){
            this.updatePwd(req, resp);
        }else if("pwdmodify".equals(method)  && method != null){
            this.pwdModify(req, resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    // 修改密码
    public void updatePwd(HttpServletRequest req, HttpServletResponse resp){
        Object object = req.getSession().getAttribute(Constants.USER_SESSION);

        String newpassword = req.getParameter("newpassword");

        if(object != null && !StringUtils.isNullOrEmpty(newpassword)){
            UserService userService = new UserServiceImpl();
            boolean b = userService.updatePwd(((User) object).getId(), newpassword);
            if(b){
                req.setAttribute("message", "修改密码成功，请退出，使用新密码登录");
                // 密码修改成功，移除当前session
                req.getSession().removeAttribute(Constants.USER_SESSION);
            }else{
                // 密码修改失败
                req.setAttribute("message", "密码修改失败");
            }
        }else{
            req.setAttribute("message", "新密码有问题");
        }
        try {
            req.getRequestDispatcher("pwdmodify.jsp").forward(req,resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 验证旧密码
    public void pwdModify(HttpServletRequest req, HttpServletResponse resp){
        Object object = req.getSession().getAttribute(Constants.USER_SESSION);
        String oldpassword = req.getParameter("oldpassword");

        Map<Object, Object> resultMap = new HashMap<>();

        // session过期了
        if(object == null){
            resultMap.put("result", "sessionerror");
        }
        // 输入密码为空
        else if(StringUtils.isNullOrEmpty(oldpassword)){
            resultMap.put("result", "error");
        }else{
            String userPassword = ((User) object).getUserPassword();
            if(oldpassword.equals(userPassword)){
                resultMap.put("result", "true");
            }else{
                resultMap.put("result", "false");
            }

        }
        resp.setContentType("application/json");
        try {
            PrintWriter writer = resp.getWriter();
            writer.write(JSONArray.toJSONString(resultMap));
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
