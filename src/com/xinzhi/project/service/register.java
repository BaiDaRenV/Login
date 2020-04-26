package com.xinzhi.project.service;

import com.xinzhi.project.util.User;

public interface register {
    Boolean register(String username,String userpwd,String address);
    User queryByname(String username);
}
