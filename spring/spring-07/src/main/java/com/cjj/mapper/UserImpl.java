package com.cjj.mapper;

import com.cjj.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/6/1
 * Time:11:48
 */
public class UserImpl extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> selectList() {
        //return getSqlSession().getMapper(UserMapper.class).selectList();
        return getSqlSessionTemplate().getMapper(UserMapper.class).selectList();
    }
}
