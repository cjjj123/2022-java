package com.example.thread.thread01;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * 图片下载
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/10
 * Time:15:59
 */
public class Download {


    /**
     * 下载网页
     * @param url
     * @param name
     */
    public void down(String url, String name){
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
