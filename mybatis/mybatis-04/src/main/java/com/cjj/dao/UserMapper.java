package com.cjj.dao;

import com.cjj.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
    @Select("select * from user")
    List<User> getUserList();

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id);

    /**
     * 添加用户
     * @param user
     * @return
     */
    @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{password})")
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

    /**
     * 分页
     * @param map
     * @return
     */
    List<User> getUserByLimit(Map<String, Object> map);


}
