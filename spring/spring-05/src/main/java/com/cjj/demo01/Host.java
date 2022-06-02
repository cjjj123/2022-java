package com.cjj.demo01;

/**
 * 房东
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/31
 * Time:10:26
 */
public class Host implements Rent{


    @Override
    public void rent() {
        System.out.println("房东有房子出租");
    }
}
