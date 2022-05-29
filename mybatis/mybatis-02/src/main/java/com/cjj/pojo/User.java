package com.cjj.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/17
 * Time:17:39
 */
@Getter
@Setter
public class User {

    private int id;

    private String name;

    private String pwd;

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
