package com.cjj.dao.user;

import com.cjj.dao.BaseDao;
import com.cjj.pojo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/12
 * Time:15:20
 */
public class UserDaoImpl implements UserDao {

    @Override
    public User getLoginUser(Connection connection, String userCode) {

        PreparedStatement pstm = null;
        ResultSet rs = null;
        User user = null;
        if(connection != null){
            String sql = "select * from smbms_user where userCode = ?";
            Object[] params = {userCode};
            try {
                rs = BaseDao.exceute(connection, sql, params, rs, pstm);
                while (rs.next()){
                    user = new User();
                    user.setId(rs.getInt("id"));
                    user.setUserCode(rs.getString("userCode"));
                    user.setUserName(rs.getString("userName"));
                    user.setUserPassword(rs.getString("userPassword"));
                    user.setGender(rs.getInt("gender"));
                    user.setBirthday(rs.getDate("birthday"));
                    user.setPhone(rs.getString("phone"));
                    user.setAddress(rs.getString("address"));
                    user.setUserRole(rs.getInt("userRole"));
                    user.setCreatedBy(rs.getInt("createdBy"));
                    user.setCreationDate(rs.getTimestamp("creationDate"));
                    user.setModifyBy(rs.getInt("modifyBy"));
                    user.setModifyDate(rs.getTimestamp("modifyDate"));
                }
                BaseDao.closeResource(null,pstm, rs);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return user;
    }

    @Override
    public int updatePwd(Connection connection, int id, String password) {
        String sql = " update smbms_user set userPassword = ? where id = ?";
        PreparedStatement preparedStatement = null;
        int exceute = 0;

        if(connection != null){
            Object[] params = {password, id};
            try {
                exceute = BaseDao.exceute(connection, sql, params, preparedStatement);
            } catch (Exception e) {
                e.printStackTrace();
            }
            BaseDao.closeResource(null, preparedStatement, null);
        }


        return exceute;
    }
}
