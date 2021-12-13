package com.example.thread.thread14Lock;

/**
 * 模拟加锁
 * @author Wei
 * @title: TestRLockAction
 * @projectName 2022-java
 * @description: TODO
 * @date 2021/12/1321:48
 */
public class TestRLockAction {

    public static void main(String[] args) {
        TestRLock testRLock = new TestRLock();
        new Thread(testRLock).start();
        new Thread(testRLock).start();
        new Thread(testRLock).start();
    }
}
