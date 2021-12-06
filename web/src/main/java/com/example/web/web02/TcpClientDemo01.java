package com.example.web.web02;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 客户端
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/6
 * Time:18:26
 */
public class TcpClientDemo01 {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream outputStream = null;
        try {
            socket = new Socket("127.0.0.1", 9999);
            outputStream = socket.getOutputStream();
            outputStream.write("哈哈".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                outputStream.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
