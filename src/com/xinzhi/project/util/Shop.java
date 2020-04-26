package com.xinzhi.project.util;

public class Shop {
    private Integer shop_id;
    private String shop_name;
    private ShopType shopType;
    private double shop_price;
    private  double shop_price_vip;
    private Integer shop_num;
    private Integer shop_flag;
    private Integer admin_id;
    public Integer getShop_id() {
        return shop_id;
    }

    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }


    public double getShop_price() {
        return shop_price;
    }

    public void setShop_price(double shop_price) {
        this.shop_price = shop_price;
    }

    public double getShop_price_vip() {
        return shop_price_vip;
    }

    public void setShop_price_vip(double shop_price_vip) {
        this.shop_price_vip = shop_price_vip;
    }

    public Integer getShop_num() {
        return shop_num;
    }

    public void setShop_num(Integer shop_num) {
        this.shop_num = shop_num;
    }

    public Integer getShop_flag() {
        return shop_flag;
    }

    public void setShop_flag(Integer shop_flag) {
        this.shop_flag = shop_flag;
    }

    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    public ShopType getShopType() {
        return shopType;
    }

    public void setShopType(ShopType shopType) {
        this.shopType = shopType;
    }

    public Shop(Integer shop_id, String shop_name, ShopType shopType, double shop_price, double shop_price_vip, Integer shop_num, Integer shop_flag, Integer admin_id) {
        this.shop_id = shop_id;
        this.shop_name = shop_name;
        this.shopType = shopType;
        this.shop_price = shop_price;
        this.shop_price_vip = shop_price_vip;
        this.shop_num = shop_num;
        this.shop_flag = shop_flag;
        this.admin_id = admin_id;

    }

    public Shop(Integer shop_id, String shop_name) {
        this.shop_id = shop_id;
        this.shop_name = shop_name;
    }
}
