package com.example.web.web02;

import java.io.*;
import java.net.Socket;

/**
 * 文件复制客户端
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/8
 * Time:9:53
 */
public class TcpCopyClient {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost",8999);

        OutputStream outputStream = socket.getOutputStream();

        //读取文件中的内容
        FileInputStream fileInputStream = new FileInputStream(new File("F:\\a.txt"));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();


        int len = 0;
        byte[] bytes = new byte[1024*8];
        while ((len = fileInputStream.read(bytes)) != -1){
            byteArrayOutputStream.write(bytes,0,len);
        }
        outputStream.write(byteArrayOutputStream.toString().getBytes());
        outputStream.close();
        socket.close();

    }
}
