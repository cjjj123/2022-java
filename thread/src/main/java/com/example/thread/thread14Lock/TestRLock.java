package com.example.thread.thread14Lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 模拟加锁
 * @author Wei
 * @title: TestRLock
 * @projectName 2022-java
 * @description: TODO
 * @date 2021/12/1321:46
 */
public class TestRLock implements Runnable{

    int ticketNum = 10;

    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            try {
                lock.lock();
                if(ticketNum <= 0){
                    return;
                }
                Thread.sleep(100);
                System.out.println(ticketNum--);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }

    }
}
