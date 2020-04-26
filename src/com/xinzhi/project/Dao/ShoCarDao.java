package com.xinzhi.project.Dao;

import com.xinzhi.project.util.ShopCar;

import java.util.List;

public interface ShoCarDao {
    List<ShopCar> findAll(int  user_id);
}
