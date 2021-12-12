package com.example.thread.thread06Stop;

/**
 * @author Wei
 * @title: TestStopAction
 * @projectName 2022-java
 * @description: TODO
 * @date 2021/12/1214:40
 */
public class TestStopAction {

    public static void main(String[] args) {
        TestStop testStop = new TestStop();
        new Thread(testStop).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程运行了" + i + "次");
            if(i == 900){
                testStop.stop();
                System.out.println("子线程停止了");
            }
        }
    }
}
