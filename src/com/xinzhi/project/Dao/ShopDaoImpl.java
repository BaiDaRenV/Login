package com.xinzhi.project.Dao;

import com.xinzhi.project.JdbcUtils.Jdbcutils;
import com.xinzhi.project.util.Page;
import com.xinzhi.project.util.Shop;
import com.xinzhi.project.util.ShopType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShopDaoImpl implements ShopDao {
    @Override
    public Integer totalcount() {
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Page<Shop> page=new Page<>();
        int count=0;
        try {
            conn= Jdbcutils.getconn();
            String sql="select count(0) from shop";
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
//               page.setTotalCount(rs.getInt("count(0)"));
               count=rs.getInt("count(0)");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public List<Shop> finddataALL(Integer statrIndex, Integer limit) {
        List<Shop> list=new ArrayList<>();
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            conn= Jdbcutils.getconn();
            String sql="select *from shop s,shop_type st where  s.shop_type=st.shop_type_id limit ?,?";
            ps=conn.prepareStatement(sql);
            ps.setInt(1,statrIndex);
            ps.setInt(2,limit);
            rs=ps.executeQuery();

            while (rs.next()){
              list.add(new Shop(rs.getInt(1),rs.getString(2),new ShopType(rs.getInt(9),rs.getString(10)),rs.getInt(4),rs.getDouble(5),rs.getInt(6),rs.getInt(7)
              ,rs.getInt(8)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
