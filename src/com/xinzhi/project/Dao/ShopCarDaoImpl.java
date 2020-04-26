package com.xinzhi.project.Dao;

import com.xinzhi.project.JdbcUtils.Jdbcutils;
import com.xinzhi.project.service.ShopCarDao;
import com.xinzhi.project.util.Shop;
import com.xinzhi.project.util.ShopCar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShopCarDaoImpl implements ShopCarDao {
    @Override
    public List<ShopCar> findAll(int user_id) {
        List<ShopCar> list=new ArrayList<>();
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
           conn= Jdbcutils.getconn();
           String sql="select * from shop_car where user_id=? ";
           ps=conn.prepareStatement(sql);
           rs=ps.executeQuery();
           ps.setInt(1,user_id);
           while (rs.next()){

               ShopCar shopCar=new ShopCar(rs.getInt(1),rs.getInt(2),rs.getDouble(3),rs.getInt(4),rs.getInt(5));
                list.add(shopCar);
           }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
