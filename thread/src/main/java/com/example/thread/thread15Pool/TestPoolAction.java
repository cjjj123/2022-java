package com.example.thread.thread15Pool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * @author Wei
 * @title: TestPoolAction
 * @projectName 2022-java
 * @description: TODO
 * @date 2021/12/1322:18
 */
public class TestPoolAction {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        pool.execute(new TestPool());
        pool.execute(new TestPool());
        pool.execute(new TestPool());
        pool.execute(new TestPool());
        pool.execute(new TestPool());
        pool.execute(new TestPool());
        pool.shutdown();
    }
}
