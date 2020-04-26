package com.xinzhi.project.JdbcUtils;

import java.sql.*;

public class Jdbcutils {
    private  final  static  String DRIVER="com.mysql.jdbc.Driver";
    private  final  static  String URL="jdbc:mysql://localhost:3306/xinzhishop3";
    private  final  static  String USER="root";
    private  final  static  String PASS="1234";
    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getconn() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASS);
    }
    public static  void close(Connection conn, Statement st, ResultSet rs){
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (st!=null){
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        System.out.println(Jdbcutils.getconn());
    }
}
