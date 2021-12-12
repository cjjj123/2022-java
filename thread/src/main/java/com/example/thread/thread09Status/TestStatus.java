package com.example.thread.thread09Status;

/**
 * 检测线程状态
 * @author Wei
 * @title: TestStatus
 * @projectName 2022-java
 * @description: TODO
 * @date 2021/12/1215:11
 */
public class TestStatus implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("-----------------");
    }
}
