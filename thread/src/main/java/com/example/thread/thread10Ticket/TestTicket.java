package com.example.thread.thread10Ticket;

import lombok.Data;

/**
 * 模拟买票
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/13
 * Time:15:44
 */
@Data
public class TestTicket implements Runnable {

    private int ticketNum = 10;

    private boolean flag = true;


    @Override
    public void run() {
        while (flag){
            buy();
        }
    }

    public void buy(){
        if(ticketNum <= 0){
            flag = false;
            return;
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "拿到了第" + ticketNum-- + "张票");
    }

}
