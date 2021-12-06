package com.example.web.web01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 测试ip
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/6
 * Time:17:41
 */
public class TestInetAddress {

    public static void main(String[] args) {
        InetAddress localHost = null;
        try {
            localHost = InetAddress.getLocalHost();
            InetAddress byName = InetAddress.getByName("localhost");
            System.out.println(byName);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        System.out.println(localHost);
    }
}
