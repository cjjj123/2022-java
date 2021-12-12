package com.example.thread.thread04Proxy;

/**
 * 静态代理模式
 * 真实对象（Taget）和代理对象（WeddingProxy）都要实现用一个接口
 * 好处：代理对象可以做真实对象做不了的事情
 * 真实对象专注做自己的事情
 * 线程也是这种代理模式
 * @author Wei
 * @title: TestProxy
 * @projectName 2022-java
 * @description: TODO
 * @date 2021/12/1210:41
 */
public class TestProxy {
    public static void main(String[] args) {

        WeddingProxy weddingProxy = new WeddingProxy(new Taget("我"));
        weddingProxy.marry();
    }
}
