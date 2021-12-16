package com.example.reflection.reflection01;

import lombok.Data;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/16
 * Time:15:13
 */
@Data
public class User {

    private String name;

    private String age;

    private String address;

    public User() {
    }

    public User(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
