package com.example.thread.thread16PC;

/**
 * 生产者
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/14
 * Time:17:44
 */
public class Producer implements Runnable{

    private Baozi baozi;

    public Producer(Baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        synchronized (baozi.quene){
            // 队列满了，等待消费者消费
            while (baozi.quene.size() == Baozi.max_count){
                System.out.println("队列满了，等待消费者去消费");
                try {
                    baozi.quene.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 生产包子
            baozi.quene.add("1");
            System.out.println(Thread.currentThread().getName() + "生产包子，库存为：" + baozi.quene.size());
            baozi.quene.notify();
        }

    }
}
