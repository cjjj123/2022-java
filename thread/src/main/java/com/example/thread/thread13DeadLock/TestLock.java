package com.example.thread.thread13DeadLock;

import lombok.Data;

/**
 * 模拟死锁
 * @author Wei
 * @title: TestLock
 * @projectName 2022-java
 * @description: TODO
 * @date 2021/12/1321:22
 */
@Data
public class TestLock implements Runnable{

    static Lipstick lipstick = new Lipstick();

    static Mirror mirror = new Mirror();

    private int choose;

    private String name;

    public TestLock(int choose, String name) {
        this.choose = choose;
        this.name = name;
    }

    @Override
    public void run() {
        // 死锁
        //makeUp();
        // 非死锁
        unMakeUp();
    }

    /**
     * 死锁
     */
    private void makeUp(){
        if(choose == 0){
            synchronized (lipstick){
                System.out.println(name + "拿到了口红的锁");
                synchronized (mirror){
                    System.out.println(name + "拿到了镜子的锁");
                }
            }
        }else{
            synchronized (mirror){
                System.out.println(name + "拿到了镜子的锁");
                synchronized (lipstick){
                    System.out.println(name + "拿到了口红的锁");
                }
            }
        }
    }

    /**
     * 不造成死锁
     */
    private void unMakeUp(){
        if(choose == 0){
            synchronized (lipstick){
                System.out.println(name + "拿到了口红的锁");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (mirror){
                System.out.println(name + "拿到了镜子的锁");
            }
        }else{
            synchronized (mirror){
                System.out.println(name + "拿到了镜子的锁");
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lipstick){
                System.out.println(name + "拿到了口红的锁");
            }
        }
    }
}
