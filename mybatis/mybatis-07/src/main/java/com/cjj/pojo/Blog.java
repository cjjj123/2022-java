package com.cjj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * 博客
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/23
 * Time:15:44
 */
@Data
@AllArgsConstructor
public class Blog {

    private String id;

    private String title;

    private String author;

    private Date createTime;

    private int views;
}
