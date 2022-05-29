package com.cjj.dao;

import com.cjj.pojo.Teacher;

import java.util.List;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/20
 * Time:17:21
 */
public interface TeacherMapper {

    // 获取老师
    List<Teacher> getTeacherList();

    // 获取指定老师下的所有学生及老师的信息
    Teacher getTeacher(int id);

    // 获取指定老师下的所有学生及老师的信息
    Teacher getTeacher2(int id);

}
