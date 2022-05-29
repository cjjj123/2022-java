package com.cjj.pojo;

import lombok.Data;

import java.util.List;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/20
 * Time:17:20
 */
@Data
public class Teacher {

    private int id;

    private String name;

    private List<Student> students;
}
