package com.xinzhi.project.service;

import com.xinzhi.project.util.Shop;

import java.util.List;

public interface ShopDaoService {
    Integer totalcount();
    List<Shop> finddataAll(Integer statrIndex,Integer limit);
}
