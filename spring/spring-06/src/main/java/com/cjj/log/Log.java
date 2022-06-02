package com.cjj.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 方法执行前
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/31
 * Time:16:29
 */
public class Log implements MethodBeforeAdvice {

    /**
     *
     * @param method 要执行的目标对象的方法
     * @param args  参数
     * @param target 目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {

        System.out.println("执行方法前");
    }
}
