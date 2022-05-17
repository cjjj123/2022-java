package com.cjj.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * 操作数据库的基类
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/12
 * Time:11:27
 */
public class BaseDao {

    private static String driver;

    private static String url;

    private static String username;

    private static String password;

    // 静态代码块，类加载的时候初始化
    static {
        // 通过类加载器来获取对应资源
        InputStream resourceAsStream = BaseDao.class.getClassLoader().getResourceAsStream("db.properties");

        Properties properties = new Properties();

        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver = (String) properties.get("driver");
        url = (String) properties.get("url");
        username = (String) properties.get("username");
        password = (String) properties.get("password");

    }

    // 获取数据库链接
    public static Connection getConnention(){
        Connection connection = null;
        try {
            // 加载驱动
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }

    // 编写查询公共类
    public static ResultSet exceute(Connection connection, String sql, Object[] params,ResultSet resultSet, PreparedStatement preparedStatement) throws Exception {
        preparedStatement = connection.prepareStatement(sql);
        for (int i = 0; i < params.length; i++) {
            preparedStatement.setObject(i + 1, params[i]);
        }
        resultSet = preparedStatement.executeQuery();
        return resultSet;
    }

    // 编写增删改公共方法
    public static int exceute(Connection connection, String sql, Object[] params, PreparedStatement preparedStatement) throws Exception {
        preparedStatement = connection.prepareStatement(sql);
        for (int i = 0; i < params.length; i++) {
            preparedStatement.setObject(i + 1, params[i]);
        }
        int updateRows = preparedStatement.executeUpdate();
        return updateRows;
    }

    // 释放资源
    public static boolean closeResource(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet){
        boolean flag = true;
        if(resultSet != null){
            try {
                resultSet.close();
                // GC回收，关闭完，万一resultSet还存在，就设置未空
                resultSet = null;
            } catch (SQLException e) {
                e.printStackTrace();
                flag = false;
            }
        }
        if(preparedStatement != null){
            try {
                preparedStatement.close();
                // GC回收，关闭完，万一resultSet还存在，就设置未空
                preparedStatement = null;
            } catch (SQLException e) {
                e.printStackTrace();
                flag = false;
            }
        }
        if(connection != null){
            try {
                connection.close();
                // GC回收，关闭完，万一resultSet还存在，就设置未空
                connection = null;
            } catch (SQLException e) {
                e.printStackTrace();
                flag = false;
            }
        }
        return  flag;

    }

}
