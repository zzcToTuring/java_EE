package com.test.curd;

import com.mysql.cj.jdbc.Driver;
import java.sql.*;

public class demo1_基础使用 {
    /**
     * 利用JDBC技术，完成数据查询操作(基础查询)
     * 步骤：
     *  1. 注册驱动：DriverManager.registerDriver(new Driver());
     *  2. 获取连接：Connection connection = DriverManager.getConnection()
     *  3. 创建statement：ResultSet resultSet =  statement.executeQuery(sql);
     *  4. 发送SQL语句,并获取结果：ResultSet resultSet =  statement.executeQuery(sql);
     *  5. 结果集解析：resultSet.next()收集
     *  6. 关闭资源：xxx.close()
     */
    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shiro","root","root");
        Statement statement = connection.createStatement();
        String sql = "select id,account,password,nickname from t_user ;";
        ResultSet resultSet =  statement.executeQuery(sql);
        while (resultSet.next()){
            int id=resultSet.getInt("id");
            String num1=resultSet.getString(1);
            String account= resultSet.getString("account");
            String password=resultSet.getString("password");
            String nickname=resultSet.getString("nickname");
            System.out.println("id    :"+id);
            System.out.println(num1+"    "+account+"      "+password+"       "+nickname+"      ");
        }
        resultSet.close();
        statement.close();
        connection.close();
    }

}
