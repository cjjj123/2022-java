package com.example.thread.thread15Pool;

/**
 *  线程池
 * @author Wei
 * @title: TestPool
 * @projectName 2022-java
 * @description: TODO
 * @date 2021/12/1322:17
 */
public class TestPool implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
