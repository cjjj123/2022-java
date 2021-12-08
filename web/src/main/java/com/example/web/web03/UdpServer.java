package com.example.web.web03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Udp服务器
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/8
 * Time:15:53
 */
public class UdpServer {

    public static void main(String[] args) throws Exception {


        DatagramSocket datagramSocket = new DatagramSocket(8888);

        while (true){
            byte[] bytes = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytes, 0 , bytes.length);

            datagramSocket.receive(datagramPacket);

            String context = new String(datagramPacket.getData(), 0, datagramPacket.getLength());

            System.out.println("输入内容为：" + context);


            if("bye".equals(context.trim())){
                System.out.println("断开链接");
                break;
            }
        }
        datagramSocket.close();


        // 初级版
        /*DatagramSocket datagramSocket = new DatagramSocket(8888);


        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes,0,bytes.length);

        datagramSocket.receive(datagramPacket);

        System.out.println(new String(datagramPacket.getData(),0,datagramPacket.getLength()));

        datagramSocket.close();*/

    }
}
