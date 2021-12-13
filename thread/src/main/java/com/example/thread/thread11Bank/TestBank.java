package com.example.thread.thread11Bank;

import lombok.Data;

/**
 * 模拟银行取钱
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/13
 * Time:15:54
 */
@Data
public class TestBank implements Runnable{

    // 操作人
    private String name;
    // 操作金额
    private int money;
    // 账户
    private Account account;

    public TestBank(String name, int money, Account account ) {
        this.name = name;
        this.money = money;
        this.account = account;
    }


    @Override
    public void run() {
        synchronized (account){
            if(account.getAccountMoney() - money < 0){
                System.out.println(name + "，您账户余额不足了");
                return;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 剩余账户金额
            account.setAccountMoney(account.getAccountMoney() - money);
            System.out.println("账户上的钱剩余：" + account.getAccountMoney());
            // 手上的钱
            System.out.println(name + "，您手上的钱为：" + money);
        }

    }
}
