package com.cjj.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/28
 * Time:9:00
 */
@Data
public class User implements Serializable {

    private int id;

    private String name;

    private String pwd;
}
