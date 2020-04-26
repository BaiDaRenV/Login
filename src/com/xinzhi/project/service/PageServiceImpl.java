package com.xinzhi.project.service;

import com.xinzhi.project.Dao.ShopDao;
import com.xinzhi.project.Dao.ShopDaoImpl;
import com.xinzhi.project.util.Page;
import com.xinzhi.project.util.Shop;

import java.util.List;

public class PageServiceImpl implements PageService{
    private ShopDao shopDao=new ShopDaoImpl();
    private static final int  limit=8;
    @Override
    public List<Shop> findAll(int page) {
        int index=(page-1)*limit;
        return shopDao.finddataALL(index,limit);
    }

    @Override
    public int getPages() {
        int count=shopDao.totalcount();
        int page=0;
        if (count%limit==0){
            page=count/limit;
        }else {
            page=count/limit+1;
        }
        return page;
    }

}
