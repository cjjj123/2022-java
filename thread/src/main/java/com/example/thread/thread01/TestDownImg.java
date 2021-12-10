package com.example.thread.thread01;

import lombok.Getter;
import lombok.Setter;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/10
 * Time:15:59
 */
@Getter
@Setter
public class TestDownImg implements Runnable{

    private String url;

    private String name;

    public TestDownImg(String url, String name) {
        this.url = url;
        this.name = name;
    }


    @Override
    public void run() {
        Download download = new Download();
        download.down(url, name);
    }

    public static void main(String[] args) {
        new Thread(new TestDownImg("https://images-cn.ssl-images-amazon.cn/images/I/71nuX7CP2uL.__BG0,0,0,0_FMpng_AC_UL200_SR200,200_.jpg","1.jpg")).start();
        new Thread(new TestDownImg("https://images-cn.ssl-images-amazon.cn/images/I/81v-p9lHa8L.__BG0,0,0,0_FMpng_AC_UL200_SR200,200_.jpg","2.jpg")).start();
        new Thread(new TestDownImg("https://images-cn.ssl-images-amazon.cn/images/I/51TnIzyT8rL._AC_UL200_SR200,200_.jpg","3.jpg")).start();
    }
}
