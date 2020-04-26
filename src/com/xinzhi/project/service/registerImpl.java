package com.xinzhi.project.service;

import com.xinzhi.project.Dao.UserDao;
import com.xinzhi.project.Dao.UserDaoImpl;
import com.xinzhi.project.util.User;

public class registerImpl implements register{
    UserDao userDao=new UserDaoImpl();
    @Override
    public Boolean register(String username, String userpwd, String address) {
            return userDao.register(username,userpwd,address)>0;
    }
    @Override
    public User queryByname(String username) {
        return this.userDao.queryByname(username);
    }
}
