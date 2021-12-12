package com.example.thread.thread06Stop;

import lombok.Data;

/**
 * 设置标识符停止线程
 * @author Wei
 * @title: thread06Stop
 * @projectName 2022-java
 * @description: TODO
 * @date 2021/12/1214:37
 */
@Data
public class TestStop implements Runnable{

    private boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while (flag){
            System.out.println("子线程运行了" + i++ + "次");
        }
    }

    public void stop(){
        this.flag = false;
    }
}
