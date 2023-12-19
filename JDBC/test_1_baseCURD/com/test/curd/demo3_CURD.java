package com.test.curd;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class demo3_CURD {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///shiro?user=root&password=root");

        //增加操作
        /*String sql_add = "insert into t_user(account,password,nickname) values (?,?,?);";
        PreparedStatement preparedStatement_add = connection.prepareStatement(sql_add);
        preparedStatement_add.setObject(1,"test");
        preparedStatement_add.setObject(2,"123456");
        preparedStatement_add.setObject(3,"用户");

        int i = preparedStatement_add.executeUpdate();
        if (i!=0){
            System.out.println("增加成功！");
        }
        preparedStatement_add.close();*/

        //修改操作
        /*String sql_update = "update t_user set nickname = ? where account = ? ;";
        PreparedStatement preparedStatement_update = connection.prepareStatement(sql_update);
        preparedStatement_update.setString(1, "update用户");
        preparedStatement_update.setString(2, "test");
        int rows = preparedStatement_update.executeUpdate();
        if(rows!=0){
            System.out.println("修改成功");
        }
        preparedStatement_update.close();*/

        //删除与修改同理，不做展示

        //查询并封装
        String sql_select = "select id,account,password,nickname from t_user ;";
        PreparedStatement preparedStatement_select = connection.prepareStatement(sql_select);
        ResultSet resultSet = preparedStatement_select.executeQuery();
        //封装操作
        List<Map> mapList = new ArrayList<>();
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        while (resultSet.next()) {
            //每一行都是一条
            Map map = new HashMap();
            for (int i = 1; i <= columnCount; i++) {
                map.put(metaData.getColumnLabel(i), resultSet.getString(i));
            }
            mapList.add(map);
        }

        System.out.println(mapList);

        resultSet.close();
        preparedStatement_select.close();
        connection.close();


    }

}
