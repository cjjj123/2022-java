package com.example.web.web04;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * UDP聊天
 */
public class UdpReceiver implements Runnable{


    DatagramSocket datagramSocket = null;

    private int fromPort;

    private String name;

    public UdpReceiver(String name,int fromPort) {
        this.fromPort = fromPort;
        this.name = name;

        try {
            datagramSocket = new DatagramSocket(fromPort);
        } catch (SocketException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        while (true) {
            try {
                byte[] bytes = new byte[1024];
                DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length);
                datagramSocket.receive(datagramPacket);
                String context = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
                System.out.println(this.name + "输入内容为：" + context);
                if ("bye".equals(context.trim())) {
                    System.out.println("断开链接");
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        datagramSocket.close();

    }
}
