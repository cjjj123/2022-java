package com.example.thread.thread04Proxy;

import lombok.Data;

/**
 * @author Wei
 * @title: WeddingProxy
 * @projectName 2022-java
 * @description: TODO
 * @date 2021/12/1210:46
 */
@Data
public class WeddingProxy implements Marry{

    private Taget taget;

    public WeddingProxy(Taget taget) {
        this.taget = taget;
    }

    @Override
    public void marry() {
        before();
        taget.marry();
        after();
    }

    public void before(){
        System.out.println("结婚之前，布置");
    }

    public void after(){
        System.out.println("结婚之后，交钱");
    }
}
