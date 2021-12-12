package com.example.thread.thread07Sleep;

/**
 * 模拟线程休眠
 * @author Wei
 * @title: TestSleepAction
 * @projectName 2022-java
 * @description: TODO
 * @date 2021/12/1214:48
 */
public class TestSleepAction {

    public static void main(String[] args) {
        int i = 10;
        while (true){
            System.out.println(i--);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i < 0){
                break;
            }
        }
    }

}
