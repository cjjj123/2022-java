package com.example.web.web04;

public class TalkStudent {
    public static void main(String[] args) {
        new Thread(new UdpSender(7777,"localhost",9595)).start();
        new Thread(new UdpReceiver("老师",8888)).start();
    }
}
