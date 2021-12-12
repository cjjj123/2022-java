package com.example.thread.thread09Status;

/**
 * 检测线程状态
 * @author Wei
 * @title: TestStatusAction
 * @projectName 2022-java
 * @description: TODO
 * @date 2021/12/1215:12
 */
public class TestStatusAction {
    public static void main(String[] args) {
        TestStatus testStatus = new TestStatus();
        Thread thread = new Thread(testStatus);
        Thread.State state = thread.getState();
        System.out.println(state);

        thread.start();
        state = thread.getState();
        System.out.println(state);

        while (state != Thread.State.TERMINATED) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            state = thread.getState();
                System.out.println(state);

        }

    }
}
