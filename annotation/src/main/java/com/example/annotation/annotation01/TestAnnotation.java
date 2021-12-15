package com.example.annotation.annotation01;

import java.lang.annotation.*;

/**
 * 自定义注解
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/15
 * Time:15:35
 */
public class TestAnnotation {
    public static void main(String[] args) {

    }

    @MyAnnotation
    public void test(){

    }

    @MyAnnotation2(name = "haha")
    public void test2(){

    }
}

// 注解作用的地方
@Target(ElementType.METHOD)
// 作用范围
// RUNTIME(程序运行时) > CLASS(编译后) > SOURCE(源码)
@Retention(RetentionPolicy.RUNTIME)
// 文档 表示是否讲注解生成在JAVA doc中
@Documented
// 子类可以继承父类的注解
@Inherited
@interface MyAnnotation{

}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{

    String name();

    int id() default -1; // 默认值为-1.代表不存在

}


