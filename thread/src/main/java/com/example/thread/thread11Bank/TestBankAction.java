package com.example.thread.thread11Bank;

/**
 * 模拟银行取钱，线程安全问题
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/13
 * Time:16:26
 */
public class TestBankAction {
    public static void main(String[] args) {
        Account account = new Account(1000);
        TestBank bankMe = new TestBank("我",50,account);
        TestBank bankWife = new TestBank("我老婆",100,account);
        new Thread(bankWife).start();
        new Thread(bankMe).start();

    }
}
