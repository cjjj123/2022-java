package com.cjj;

import com.cjj.dao.StudentMapper;
import com.cjj.dao.TeacherMapper;
import com.cjj.pojo.Student;
import com.cjj.pojo.Teacher;
import com.cjj.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/20
 * Time:17:37
 */
public class TestDemo {

    @Test
    public void testGetList(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        List<Teacher> list = mapper.getList();

        for (Teacher teacher : list) {
            System.out.println(teacher);
        }

        sqlSession.close();
    }

    @Test
    public void getStuTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> stuList = mapper.getStuList();
        for (Student student : stuList) {
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void getStuTest2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> stuList = mapper.getStuList2();
        for (Student student : stuList) {
            System.out.println(student);
        }
        sqlSession.close();
    }

}
