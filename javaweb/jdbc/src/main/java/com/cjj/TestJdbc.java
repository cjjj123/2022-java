package com.cjj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/11
 * Time:17:34
 */
public class TestJdbc {

    public static void main(String[] args) {
        // 配置信息
        // useUnicode=true&characterEncoding=utf-8 解决中文乱码
        String url = "jdbc:mysql://localhost:3306/testj?useUnicode=true&characterEncoding=utf-8";
        String username = "root";
        String password = "123456";


        try {
            // 加载驱动
            Class.forName("com.mysql.jdbc.Driver");

            // 链接数据库,代表数据库
            Connection connection = DriverManager.getConnection(url, username, password);

            // 向数据库发送sql的对象，CRUD
            Statement statement = connection.createStatement();

            // 编写sql
            String sql = "select * from users";

            // 执行查询sql
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                System.out.println("id = " + resultSet.getObject("id"));
                System.out.println("id = " + resultSet.getObject("name"));
                System.out.println("id = " + resultSet.getObject("password"));
                System.out.println("id = " + resultSet.getObject("email"));
                System.out.println("id = " + resultSet.getObject("birthday"));
            }

            resultSet.close();
            statement.close();
            connection.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
