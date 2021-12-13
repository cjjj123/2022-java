package com.example.thread.thread12List;

import java.util.ArrayList;
import java.util.List;

/**
 * 线程安全问题
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/13
 * Time:17:06
 */
public class TestList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
            for (int i = 0; i < 10000; i++) {
                new Thread(() -> {
                    synchronized (list){
                        list.add(Thread.currentThread().getName());
                    }
                }).start();
            }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());

    }
}
