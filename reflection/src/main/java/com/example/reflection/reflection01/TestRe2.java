package com.example.reflection.reflection01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射获取对象
 * @author Wei
 * @title: TestRe2
 * @projectName 2022-java
 * @description: TODO
 * @date 2021/12/1622:01
 */
public class TestRe2 {

    public static void main(String[] args) throws Exception {
        Class aClass = Class.forName("com.example.reflection.reflection01.User");
        User user1 = (User) aClass.newInstance();
        System.out.println(user1);

        // 通过构造器创建对象
        Constructor declaredConstructor = aClass.getDeclaredConstructor(String.class, String.class, String.class);
        User user2 = (User) declaredConstructor.newInstance("haha", "haha1", "haha2");
        System.out.println(user2);

        // 通过反射调用普通方法
        User user3 = (User) aClass.newInstance();
        Method setName = aClass.getDeclaredMethod("setName", String.class);
        // 激活
        setName.invoke(user3,"你好");
        System.out.println(user3.getName());

        // 通过反射操作属性
        User user4 = (User) aClass.newInstance();
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        // 取消安全检测，不能直接操作私有属性，我们需要关闭程序的安全检测
        name.set(user4,"中国");
        System.out.println(user4.getName());

    }
}
