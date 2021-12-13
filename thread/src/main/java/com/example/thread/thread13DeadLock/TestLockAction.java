package com.example.thread.thread13DeadLock;

/**
 * 模拟死锁
 * @author Wei
 * @title: TestLockAction
 * @projectName 2022-java
 * @description: TODO
 * @date 2021/12/1321:27
 */
public class TestLockAction {
    public static void main(String[] args) {
        new Thread(new TestLock(0,"小红")).start();
        new Thread(new TestLock(1,"小紫")).start();
    }
}
