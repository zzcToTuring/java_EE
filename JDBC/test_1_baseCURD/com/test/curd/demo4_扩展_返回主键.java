package com.test.curd;

import java.sql.*;

public class demo4_扩展_返回主键 {
    public static void main(String[] args) throws Exception {
        //执行添加操作，返回添加执行主键
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///shiro?user=root&password=root");
        String sql= "insert into t_user (account,password,nickname) values (?,?,?);";
        //步骤一：在statement中添加参数(他的值为1，用变量显示更好理解)
        PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1,"ww");
        preparedStatement.setString(2,"123456");
        preparedStatement.setString(3,"用户");

        int i = preparedStatement.executeUpdate();
        if (i!=0){
            System.out.println("添加成功");
            //步骤二：获取添加的值，同样，是resultSet的形式
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            while (generatedKeys.next()){
                System.out.println("添加的id为："+generatedKeys.getString(1));
            }
        }
    }

}
