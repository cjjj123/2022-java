package com.cjj.dao;

import com.cjj.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/17
 * Time:17:46
 */
public interface UserMapper {

    /**
     * 获取全部用户
     * @return
     */
    List<User> getUserList();

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User getUserById(int id);

    /**
     * 添加用户
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 修改用户
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteUser(int id);


}
