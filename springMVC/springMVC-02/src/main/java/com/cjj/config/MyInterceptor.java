package com.cjj.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 拦截器
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/6/9
 * Time:15:46
 */
public class MyInterceptor implements HandlerInterceptor {

    // return true :执行下一个拦截器，放行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();

        // 登录页面也放行
        if(request.getRequestURI().contains("Login")){
            return true;
        }

        if(session.getAttribute("userLoginInfo") != null){
            return true;
        }

        // 不放行，跳回登录页面
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);

        System.out.println("处理前");
        return false;
    }

    // 日志
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("处理后");
    }


    // 日志
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("清理");
    }
}
