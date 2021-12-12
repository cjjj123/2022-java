package com.example.thread.thread08Join;

/**
 * 线程加入，强制执行
 * @author Wei
 * @title: TestJoin
 * @projectName 2022-java
 * @description: TODO
 * @date 2021/12/1214:58
 */
public class TestJoin implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程VIP来了" + i);
        }
    }
}
