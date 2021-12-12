package com.example.thread.thread08Join;

/**
 * 线程强制加入
 * @author Wei
 * @title: TestJoinAction
 * @projectName 2022-java
 * @description: TODO
 * @date 2021/12/1215:00
 */
public class TestJoinAction {
    public static void main(String[] args) {
        // 子线程
        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start();

        for (int i = 0; i < 500; i++) {
            if(i == 200){
                try {
                    // 插队
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("mian" + i);
        }
    }
}
