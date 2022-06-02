package com.cjj.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 注解实现AOP
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/31
 * Time:17:35
 */
@Aspect // 标注这个类是一个切面
@Component
public class AnnotationPonitCut {


    @Before("execution(* com.cjj.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("方法执行前（方式三）");
    }

    @After("execution(* com.cjj.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("方法执行后（方式三）");
    }

    @Around("execution(* com.cjj.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        // 拿到方法参数，进行校验
        System.out.println("拿到方法参数");
        joinPoint.proceed();
        System.out.println("环绕后");
    }


}
