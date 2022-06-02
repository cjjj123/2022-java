package com.cjj.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * 方法执行后
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/31
 * Time:16:33
 */
public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("方法执行后,方法为：" +method.getName() + "， 返回的结果："+ returnValue);
    }
}
