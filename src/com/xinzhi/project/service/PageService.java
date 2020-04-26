package com.xinzhi.project.service;

import com.xinzhi.project.util.Page;
import com.xinzhi.project.util.Shop;

import java.util.List;

public interface PageService {
    List<Shop> findAll(int page);
    int  getPages();
}
