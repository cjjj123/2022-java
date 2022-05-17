package com.cjj.filter;

import com.cjj.pojo.User;
import com.cjj.util.Constants;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 登录拦截过滤器
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/12
 * Time:17:49
 */
public class SysFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        HttpSession session = request.getSession();

        // 从session中获取用户
        User user = (User) session.getAttribute(Constants.USER_SESSION);

        // 已经被移除，或注销，或推出登录
        if(user == null){
            response.sendRedirect(((HttpServletRequest) req).getContextPath() + "/error.jsp");
        }else{
            filterChain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {

    }
}
