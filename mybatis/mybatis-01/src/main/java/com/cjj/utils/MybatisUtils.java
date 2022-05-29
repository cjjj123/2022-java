package com.cjj.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 构建sqlsessionFactry
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/17
 * Time:17:17
 */
public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;


    static {
        String resource = "mybatis-config.xml";
        try {
            // 获取sqlSeesionFactory对象
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 获取sqlSession
     * @return
     */
    public static SqlSession getSqlSession(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }

}
