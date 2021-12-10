package com.example.web.web05;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * 网络链接
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/9
 * Time:14:51
 */
public class UrlDemo {
    public static void main(String[] args) {
        try {
            // 网络地址
            URL url = new URL("https://vodkgeyttp8.vod.126.net/cloudmusic/0169/core/10c7/e44090b856651b555b78b5c19f8a1171.mp4?wsSecret=de619fdf405fae3ff03084675b06566d&wsTime=1639033661");
            // 打开链接
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

            InputStream inputStream = urlConnection.getInputStream();

            FileOutputStream fileOutputStream = new FileOutputStream("a.mp4");

            int i = 0;
            byte[] bytes = new byte[1024];
            while ((i = inputStream.read(bytes)) != -1){
                fileOutputStream.write(bytes,0,i);
            }
            fileOutputStream.close();
            inputStream.close();
            urlConnection.disconnect();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
