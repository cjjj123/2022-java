package com.cjj.service.user;

import com.cjj.dao.BaseDao;
import com.cjj.dao.user.UserDao;
import com.cjj.dao.user.UserDaoImpl;
import com.cjj.pojo.User;

import java.sql.Connection;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/12
 * Time:15:47
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(){
        userDao = new UserDaoImpl();
    }

    @Override
    public User login(String userCode, String password) {
        Connection connention = null;
        User user = null;
        try {
            connention = BaseDao.getConnention();
            user = userDao.getLoginUser(connention, userCode);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            BaseDao.closeResource(connention, null, null);
        }
        return user;
    }

    @Override
    public boolean updatePwd(int id, String password) {
        Connection connection = null;
        try{
            connection = BaseDao.getConnention();
            int count = userDao.updatePwd(connection, id, password);
            if(count > 0){
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            BaseDao.closeResource(connection,null, null);
        }
        return false;
    }
}
