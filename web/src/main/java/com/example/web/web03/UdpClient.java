package com.example.web.web03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * UDP客户端
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/8
 * Time:15:45
 */
public class UdpClient {

    public static void main(String[] args) throws Exception {

        DatagramSocket datagramSocket = new DatagramSocket();

        while (true){
            System.out.println("请输入内容：");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String context = bufferedReader.readLine();


            DatagramPacket datagramPacket = new DatagramPacket(context.getBytes(),0,context.getBytes().length,InetAddress.getByName("localhost"), 8888);

            datagramSocket.send(datagramPacket);

            if("bye".equals(context)){
                System.out.println("输入结束");
                break;
            }
        }

        datagramSocket.close();


        // 初级版
        /*DatagramSocket datagramSocket = new DatagramSocket();

        String content = "你好，哈哈";

        DatagramPacket datagramPacket = new DatagramPacket(content.getBytes(),0,content.getBytes().length, InetAddress.getByName("localhost"),8888);

        datagramSocket.send(datagramPacket);

        datagramSocket.close();*/

    }
}
