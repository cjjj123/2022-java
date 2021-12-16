package com.example.reflection.reflection01;

/**
 * 反射测试
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/16
 * Time:15:13
 */
public class TestRe {

    public static void main(String[] args) {
        try {
            Class aClass = Class.forName("com.example.reflection.reflection01.User");
            System.out.println(aClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
