package com.cjj.servlet;


import lombok.Getter;
import lombok.Setter;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/9
 * Time:17:51
 */

@Getter
@Setter
public class Person {

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
