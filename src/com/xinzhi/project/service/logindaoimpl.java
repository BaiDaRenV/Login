package com.xinzhi.project.service;

import com.xinzhi.project.Dao.UserDao;
import com.xinzhi.project.Dao.UserDaoImpl;
import com.xinzhi.project.util.User;

public class logindaoimpl implements login{
    @Override
    public User login(String username, String userpwd) {
        UserDao userDao=new UserDaoImpl();
        return userDao.login(username,userpwd);
    }
}
