package com.example.thread.thread03Race;

/**
 * 模拟龟兔赛跑
 * @author Wei
 * @title: TestRace
 * @projectName 2022-java
 * @description: TODO
 * @date 2021/12/1115:15
 */
public class TestRace implements Runnable{



    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if(i == 100){
                System.out.println("胜利者是：" + Thread.currentThread().getName());
                break;
            }
            System.out.println(Thread.currentThread().getName() + "跑了" + i + "步");
        }
    }
}
