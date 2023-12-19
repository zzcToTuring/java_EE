package com.test.curd;

import java.sql.*;

public class demo2_prepareStatement与参数详解 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /**
         * DriverManager.registerDriver(new Driver());驱动会注册两次
         * 1次于：new Driver()时
         * 2次于：registerDriver时
         * 为避免浪费，取消2次注册，直接使用new Driver即可
         * 但避免后续更换数据源时需要对源码做较大的更改，所以可以利用反射直接注册，以下为案例
         */
        Class.forName("com.mysql.cj.jdbc.Driver");

        /**
         * 驱动连接参数说明
         * 3个参数类型：
         *      String URL: 连接数据库地址
         *      String user: 连接数据库用户名
         *      String password: 连接数据库用户对应的密码
         *      举例：
         *          jdbc:mysql://192.168.33.45/3306/day01
         *          当前电脑的省略写法！
         *          注意：本机和端口3306 jdbc:mysql://localhost:3306/day01 = jdbc:mysql:///day01
         * 2个参数类型：
         *      String URL : 写法还是jdbc的路径写法！
         *      Properties : 就是一个参数封装容器！至少要包含 user / password key!存储连接账号信息！
         * 1个参数类型：
         *      String URL: URl可以携带目标地址，可以通过?分割，在后面key=value&key=value形式传递参数
         *      jdbc:mysql:///day01?user=root&password=123456
         */
        Connection connection = DriverManager.getConnection("jdbc:mysql:///shiro?user=root&password=root");
        /**
         * 之前使用之间编译方式：
         *         Statement statement = connection.createStatement();
         *         statement.executeQuery(sql)
         * 改用：PreparedStatement(预编译)能减少拼接所带来的麻烦，而且能避免SQL注入
         * 方式如下，填充占位符的方式有set方法，具体可通过编译器查看
         */
        String sql="select * from t_user where account=? and password =?;";
        //执行一般的存储语句使用：prepareStatement；执行存储过程使用：prepareCall,具体可查阅相关资料&案例
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,"root");
        preparedStatement.setObject(2,"123456");


        /**
         * 执行executeQuery(查询语句) 返回结果集
         * 执行executeUpdate(增、删、改语句) 返回所影响的行数
         * resultSet(结果集)属性详解
         *      1、移动光标：next() 向下移动光标
         *          返回值：false: 没有数据，也不移动了！true:  有更多行，并且移动到下一行！
         *          常用搭配：if(next) while(next)
         *          ps:上下移动光标方式很多，记住next即可，若需更多查阅源码(查找："Moves the cursor to"快速定位关键字)
         *
         *      2、获取列数据(在固定行后)：get类型(int columnIndex | String columnLabel)
         *          PS:如果没有别名，等于列名， 有别名label就是别名，他就是查询结果的标识！列的角标
         *              从左到右 从1开始！ 数据库全是从1开始！
         *
         *       3、列属性变量：
         *              ResultSetMetaData metaData = resultSet.getMetaData();
         *          列总数：
         *              int columnCount = metaData.getColumnCount();
         *          列值(value)：
         *              getColumnLabel先获取列的别名，没有别名用列名，而getColumnName只是列名
         *          ……
         */
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()){
            System.out.println("数据库存在此用户");
        }else {
           System.out.println("数据库不存在此用户！！！");
       }
       resultSet.close();
       preparedStatement.close();
       connection.close();


    }
}
