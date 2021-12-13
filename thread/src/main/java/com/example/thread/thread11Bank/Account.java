package com.example.thread.thread11Bank;

import lombok.Data;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/13
 * Time:16:28
 */
@Data
public class Account {
    private int accountMoney;

    public Account(int accountMoney) {
        this.accountMoney = accountMoney;
    }
}
