package com.xinzhi.project.util;

public class ShopCar {
    private Integer shop_car_id;
    private Integer shop_car_num;
    private  Double shop_car_price;
    private Integer user_id;
    private  Integer shop_id;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getShop_id() {
        return shop_id;
    }

    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    public Integer getShop_car_id() {
        return shop_car_id;
    }

    public void setShop_car_id(Integer shop_car_id) {
        this.shop_car_id = shop_car_id;
    }


    public Integer getShop_car_num() {
        return shop_car_num;
    }

    public void setShop_car_num(Integer shop_car_num) {
        this.shop_car_num = shop_car_num;
    }

    public Double getShop_car_price() {
        return shop_car_price;
    }

    public void setShop_car_price(Double shop_car_price) {
        this.shop_car_price = shop_car_price;
    }

    public ShopCar(Integer shop_car_id, Integer shop_car_num, Double shop_car_price, Integer user_id, Integer shop_id) {
        this.shop_car_id = shop_car_id;
        this.shop_car_num = shop_car_num;
        this.shop_car_price = shop_car_price;
        this.user_id = user_id;
        this.shop_id = shop_id;
    }
}
