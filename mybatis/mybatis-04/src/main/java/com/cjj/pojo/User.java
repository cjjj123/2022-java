package com.cjj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/19
 * Time:16:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private int id;

    private String name;

    private String password;


}
