package com.xinzhi.project.Dao;

import com.xinzhi.project.JdbcUtils.Jdbcutils;
import com.xinzhi.project.util.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

    @Override
    public User login(String username, String userpwd) {
        User user=null;
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            conn= Jdbcutils.getconn();
            String sql="select  * from user where user_name=? and user_pwd=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,userpwd);
            rs=ps.executeQuery();
            user=new User();
            while (rs.next()){
                user.setUsername(rs.getString("user_name"));
                user.setUserpwd(rs.getString("user_pwd"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            Jdbcutils.close(conn,ps,rs);
        }
        return user;
    }

    @Override
    public Integer register(String username,String userpwd,String address) {
        Connection conn=null;
        PreparedStatement ps=null;
        int  count=0;
        try {
            conn=Jdbcutils.getconn();
            String sql="insert into user(user_name,user_pwd,user_address) values(?,?,?)";
            ps=conn.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,userpwd);
            ps.setString(3,address);
            count=ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            Jdbcutils.close(conn,ps,null);
        }
        return count;
    }

    @Override
    public User queryByname(String username) {
        User user=null;
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            conn= Jdbcutils.getconn();
            String sql="select  * from user where user_name=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,username);
            rs=ps.executeQuery();
            user=new User();
            while (rs.next()){
                user.setUsername(rs.getString("user_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            Jdbcutils.close(conn,ps,rs);
        }
        return user;
    }
}
