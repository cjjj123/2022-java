package com.cjj.util;

import java.util.UUID;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/23
 * Time:16:01
 */
public class IDUtils {

    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}
