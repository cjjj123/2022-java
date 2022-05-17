package com.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 中文过滤器
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/10
 * Time:18:10
 */
public class CharacterEncodingFilter implements Filter {

    // 初始化
    // tomcat启动的时候就初始化了
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CharacterEncodingFilter初始化");

    }


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=utf-8");
        System.out.println("CharacterEncodingFilter执行前");
        // 继续执行，如果不执行，则停止
        // filterChain链，因为有可能存在多个过滤器
        // 1.过滤器中的所有代码，在过滤特定请求的时候都会执行
        // 2.必须要过滤器继续通行
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("CharacterEncodingFilter执行后");
    }


    // 销毁
    @Override
    public void destroy() {

    }
}
