package com.cjj.demo02;

/**
 * 客户
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/31
 * Time:15:02
 */
public class Client {

    public static void main(String[] args) {
        Host host = new Host();
        MyProxy myProxy = new MyProxy(host);
        Rent proxy = (Rent) myProxy.getProxy();
        proxy.rent();

    }
}
