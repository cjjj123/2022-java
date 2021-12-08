package com.example.web.web04;

public class TalKTeacher {

    public static void main(String[] args) {
        new Thread(new UdpSender(5555,"localhost",8888)).start();
        new Thread(new UdpReceiver("学生",9595)).start();

    }
}
