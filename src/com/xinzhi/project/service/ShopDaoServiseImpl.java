package com.xinzhi.project.service;

import com.xinzhi.project.Dao.ShopDao;
import com.xinzhi.project.Dao.ShopDaoImpl;
import com.xinzhi.project.util.Shop;

import java.util.List;

public class ShopDaoServiseImpl implements ShopDaoService {
    ShopDao pd=new ShopDaoImpl();
    @Override
    public Integer totalcount() {

        return pd.totalcount();
    }

    @Override
    public List<Shop> finddataAll(Integer statrIndex, Integer limit) {

        return pd.finddataALL(statrIndex,limit);
    }

}
