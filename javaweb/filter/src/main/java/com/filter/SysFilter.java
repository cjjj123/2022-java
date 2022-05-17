package com.filter;

import com.util.Contant;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/11
 * Time:16:21
 */
public class SysFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;

        HttpSession session = httpServletRequest.getSession();
        Object user_session = session.getAttribute(Contant.USER_SESSION);
        if(user_session == null){
            httpServletResponse.sendRedirect("/login.jsp");
        }

        filterChain.doFilter(httpServletRequest,httpServletResponse);
    }
}
