package com.cjj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/6/8
 * Time:17:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;

    private String name;

    private String pwd;
}
