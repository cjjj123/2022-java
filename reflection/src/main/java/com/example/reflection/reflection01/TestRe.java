package com.example.reflection.reflection01;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射测试
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/16
 * Time:15:13
 */
public class TestRe {

    public static void main(String[] args) throws NoSuchMethodException {
        try {
            Class aClass = Class.forName("com.example.reflection.reflection01.User");
            System.out.println(aClass);

            // 只能找到public属性的
            for (Field field : aClass.getFields()) {
                System.out.println(field);
            }

            // 全部属性的
            Field[] declaredFields = aClass.getDeclaredFields();
            for(Field field : declaredFields){
                System.out.println(field);
            }

            // 获取本类及父类方法public
            for (Method method : aClass.getMethods()) {
                System.out.println(method);
            }

            // 获取本类方法
            for (Method declaredMethod : aClass.getDeclaredMethods()) {
                System.out.println(declaredMethod);
            }

            System.out.println("------------------");
            Method getName = aClass.getMethod("getName", null);
            System.out.println(getName);

            Method setAddress = aClass.getMethod("setAddress", String.class);
            System.out.println(setAddress);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
