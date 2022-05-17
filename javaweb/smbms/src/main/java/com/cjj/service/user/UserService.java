package com.cjj.service.user;

import com.cjj.pojo.User;

import java.sql.Connection;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/12
 * Time:15:45
 */
public interface UserService {


    User login(String userCode, String password);

    // 修改当前用户密码
    boolean updatePwd(int id, String password);


}
