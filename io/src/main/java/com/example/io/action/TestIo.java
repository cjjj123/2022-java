package com.example.io.action;

import java.io.*;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/7
 * Time:10:01
 */
public class TestIo {

    public static void main(String[] args) {

        File file1 = new File("F:\\a.txt");
        File file2 = new File("F:\\b.txt");
        FileInputStream fileInputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        // 输入到a.txt
        try {
            fileInputStream = new FileInputStream(file1);
            byteArrayOutputStream = new ByteArrayOutputStream();
            int temp = 0;
            byte[] bytes = new byte[1024];
            while((temp = fileInputStream.read(bytes)) != -1){
                byteArrayOutputStream.write(bytes,0, temp);
            }
            System.out.println(byteArrayOutputStream.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
