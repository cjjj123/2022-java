package com.cjj.mapper;

import com.cjj.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/6/1
 * Time:11:08
 */
public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<User> selectList() {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        List<User> users = mapper.selectList();
        return users;
    }
}
