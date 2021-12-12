package com.example.thread.thread04Proxy;

import lombok.Getter;
import lombok.Setter;

/**
 * 结婚对象
 * @author Wei
 * @title: Taget
 * @projectName 2022-java
 * @description: TODO
 * @date 2021/12/1210:41
 */
@Getter
@Setter
public class Taget implements Marry{

    private String name;

    public Taget(String name) {
        this.name = name;
    }

    @Override
    public void marry(){
        System.out.println(name + "结婚了，好开心");
    }
}
