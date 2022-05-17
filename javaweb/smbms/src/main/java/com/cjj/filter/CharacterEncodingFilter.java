package com.cjj.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 字节编码过滤器
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/12
 * Time:14:45
 */
public class CharacterEncodingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=UTF-8");

        //让我们的请求继续走，如果不写，程序到这里就被拦截停止！
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
