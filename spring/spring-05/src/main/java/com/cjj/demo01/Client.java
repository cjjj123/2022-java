package com.cjj.demo01;

/**
 * 客户
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/31
 * Time:10:25
 */
public class Client {

    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }

}
