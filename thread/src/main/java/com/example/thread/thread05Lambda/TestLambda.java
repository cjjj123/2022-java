package com.example.thread.thread05Lambda;

/**
 * @author Wei
 * @title: TestLambda
 * @projectName 2022-java
 * @description: TODO
 * @date 2021/12/1211:17
 */
public class TestLambda {

    public static void main(String[] args) {
        ITestLambda iTestLambda = null;

        iTestLambda = (a,b) -> {
            System.out.println("haha" + a);
            System.out.println(1111);
        };

        iTestLambda.love(11,33);


    }
}
