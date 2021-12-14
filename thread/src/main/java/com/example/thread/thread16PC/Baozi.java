package com.example.thread.thread16PC;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 缓冲区
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/14
 * Time:17:46
 */
public class Baozi {

    static int max_count = 1;

    public LinkedList<String> quene = new LinkedList<>();

    public static void main(String[] args) {
        Baozi baozi = new Baozi();
        Producer producer = new Producer(baozi);
        Consumer consumer = new Consumer(baozi);
        for (int i = 0; i < 10; i++) {
            Thread pro = new Thread(producer);
            pro.start();
            Thread con = new Thread(consumer);
            con.start();
        }
    }

}
