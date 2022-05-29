package com.cjj.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/19
 * Time:10:27
 */
public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

    static {

        String path = "mybatis-config.xml";

        try {
            InputStream resourceAsStream = Resources.getResourceAsStream(path);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession(true);
    }

}
