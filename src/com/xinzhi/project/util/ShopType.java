package com.xinzhi.project.util;

public class ShopType {
    private Integer shop_type_id;
    private String shop_type_name;

    public Integer getShop_type_id() {
        return shop_type_id;
    }

    public void setShop_type_id(Integer shop_type_id) {
        this.shop_type_id = shop_type_id;
    }

    public String getShop_type_name() {
        return shop_type_name;
    }

    public void setShop_type_name(String shop_type_name) {
        this.shop_type_name = shop_type_name;
    }

    public ShopType(Integer shop_type_id, String shop_type_name) {
        this.shop_type_id = shop_type_id;
        this.shop_type_name = shop_type_name;
    }

}
