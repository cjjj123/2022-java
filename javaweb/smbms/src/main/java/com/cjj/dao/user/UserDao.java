package com.cjj.dao.user;

import com.cjj.pojo.User;

import java.sql.Connection;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/12
 * Time:15:19
 */
public interface UserDao {

    // 得到要登录的用户
    User getLoginUser(Connection connection, String userCode);

    // 修改当前用户密码
    int updatePwd(Connection connection, int id, String password);
}
