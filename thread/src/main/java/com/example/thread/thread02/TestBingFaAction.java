package com.example.thread.thread02;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/10
 * Time:17:16
 */
public class TestBingFaAction {

    public static void main(String[] args) {
        TestBingFa testBingFa = new TestBingFa();
        new Thread(testBingFa, "小明").start();
        new Thread(testBingFa, "老师").start();
        new Thread(testBingFa, "黄牛党").start();
    }

}
