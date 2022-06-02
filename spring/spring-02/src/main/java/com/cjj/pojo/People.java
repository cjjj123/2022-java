package com.cjj.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/30
 * Time:16:48
 */
@Data
public class People {

    @Autowired
    private Cat cat;

    @Autowired
    private Dog dog;

    private String name;
}
