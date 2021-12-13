package com.example.thread.thread10Ticket;

/**
 * 模拟买票，线程安全问题
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/13
 * Time:15:51
 */
public class TestTicketAction {

    public static void main(String[] args) {
        TestTicket testTicket = new TestTicket();
        new Thread(testTicket,"我").start();
        new Thread(testTicket,"你").start();
        new Thread(testTicket,"她").start();
    }
}
