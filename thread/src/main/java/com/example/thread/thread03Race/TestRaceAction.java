package com.example.thread.thread03Race;

/**
 * @author Wei
 * @title: TestRaceAction
 * @projectName 2022-java
 * @description: TODO
 * @date 2021/12/1115:19
 */
public class TestRaceAction {
    public static void main(String[] args) {
        TestRace testRace = new TestRace();
        new Thread(testRace,"乌龟").start();
        new Thread(testRace, "兔子").start();
    }
}
