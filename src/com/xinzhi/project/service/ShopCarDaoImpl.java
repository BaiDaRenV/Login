package com.xinzhi.project.service;

import com.xinzhi.project.util.ShopCar;

import java.util.List;

public class ShopCarDaoImpl implements ShopCarDao{
    private ShopCarDao l=new ShopCarDaoImpl();
    @Override
    public List<ShopCar> findAll(int user_id) {
        return l.findAll(user_id);
    }
}
