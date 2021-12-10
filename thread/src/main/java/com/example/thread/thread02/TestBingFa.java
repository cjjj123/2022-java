package com.example.thread.thread02;

import lombok.Getter;
import lombok.Setter;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/10
 * Time:17:12
 */
@Getter
@Setter
public class TestBingFa implements Runnable{

    private int count = 10;

    @Override
    public void run() {
        while(true){
            if (count <= 0){
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "拿到了第" + count-- + "张票");
        }

    }
}
