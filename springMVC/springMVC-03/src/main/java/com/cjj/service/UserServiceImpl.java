package com.cjj.service;

import com.cjj.dao.UserMapper;
import com.cjj.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/6/8
 * Time:18:02
 */
@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> getList() {
        return userMapper.getList();
    }
}
