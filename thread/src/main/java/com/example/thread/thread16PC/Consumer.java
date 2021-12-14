package com.example.thread.thread16PC;

/**
 * 消费者
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/14
 * Time:17:44
 */
public class Consumer implements Runnable{

    private Baozi baozi;

    public Consumer(Baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        synchronized (baozi.quene){
            // 包子没了，等待生产者生产包子
            while(baozi.quene.size() == 0){
                System.out.println("包子没了，等待生产者生产包子");
                try {
                    baozi.quene.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            baozi.quene.removeFirst();
            System.out.println(Thread.currentThread().getName() + "消费包子，库存为：" + baozi.quene.size());
            baozi.quene.notify();
        }

    }
}
