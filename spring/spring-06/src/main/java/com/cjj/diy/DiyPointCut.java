package com.cjj.diy;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/31
 * Time:16:58
 */
public class DiyPointCut {

    // 方法执行前
    public void before(){
        System.out.println("方法执行前(自定义类)");
    }

    // 方法执行后
    public void after(){
        System.out.println("方法执行后(自定义类)");
    }
}
