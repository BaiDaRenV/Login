package com.xinzhi.project.Dao;

import com.xinzhi.project.util.User;

public interface UserDao {
    User login(String username,String userpwd);
    Integer register(String username,String userpwd,String address);
    User queryByname(String username);
}
