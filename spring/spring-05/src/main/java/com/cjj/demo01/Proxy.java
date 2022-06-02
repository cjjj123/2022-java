package com.cjj.demo01;

/**
 * 中介(静态代理)
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/31
 * Time:10:27
 */
public class Proxy implements Rent{

    private Host host;

    public Proxy(Host host){
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
    }
}
