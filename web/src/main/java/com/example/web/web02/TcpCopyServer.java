package com.example.web.web02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 文件复制服务器
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/8
 * Time:9:54
 */
public class TcpCopyServer {

    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(8999);

        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();

        FileOutputStream fileOutputStream = new FileOutputStream(new File("F:\\c.txt"));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        int len = 0;
        while ((len = inputStream.read()) != -1){
            byteArrayOutputStream.write(len);
        }
        fileOutputStream.write(byteArrayOutputStream.toString().getBytes());

        fileOutputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();


    }

}
