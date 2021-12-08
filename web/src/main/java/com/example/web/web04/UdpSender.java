package com.example.web.web04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

/**
 * UDP聊天
 */
public class UdpSender implements Runnable{

    DatagramSocket datagramSocket = null;

    BufferedReader bufferedReader = null;

    /**
     * 对方的ip
     */
    private String toIP;
    /**
     * 对方的端口
     */
    private int toPort;

    /**
     * 自己的ip
     */
    private int fromPort;

    public UdpSender(int fromPort, String toIP, int toPort) {
        this.toIP = toIP;
        this.toPort = toPort;
        this.fromPort = fromPort;

        try {
            datagramSocket = new DatagramSocket(fromPort);
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        } catch (SocketException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("请输入内容：");
                String context = bufferedReader.readLine();
                DatagramPacket datagramPacket = new DatagramPacket(context.getBytes(), 0, context.getBytes().length, new InetSocketAddress(this.toIP, this.toPort));
                datagramSocket.send(datagramPacket);
                if ("bye".equals(context)) {
                    System.out.println("输入结束");
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    }
}
