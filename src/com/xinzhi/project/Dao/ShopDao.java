package com.xinzhi.project.Dao;

import com.xinzhi.project.util.Shop;

import java.util.List;

public interface ShopDao {
    Integer totalcount();
    List<Shop> finddataALL(Integer statrIndex,Integer limit);
}
