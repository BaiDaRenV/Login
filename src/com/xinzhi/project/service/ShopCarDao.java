package com.xinzhi.project.service;

import com.xinzhi.project.util.ShopCar;

import java.util.List;

public interface ShopCarDao {
    List<ShopCar> findAll(int  user_id);

}
