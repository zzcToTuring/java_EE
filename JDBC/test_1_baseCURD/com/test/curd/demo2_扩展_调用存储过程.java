package com.test.curd;

import java.sql.*;

public class demo2_扩展_调用存储过程 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //纯数字类型
        type3();
    }
    //类型1：纯数字类，无表单操作。存储过程：计算参数1和参数2的值，赋值给参数3
    private static void type1() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///shiro?user=root&password=root");
        String sql_1="call mypro(?,?,?) ";
        CallableStatement callableStatement = connection.prepareCall(sql_1);
        //设置第一个和第二个参数的值
        callableStatement.setInt(1,1);
        callableStatement.setInt(2,4);
        //注册参数3(返回值)的类型
        callableStatement.registerOutParameter(3, Types.INTEGER);
        callableStatement.executeUpdate();
        //获取参数3(返回值)的类型
        int res = callableStatement.getInt(3);
        System.out.println(res);
        callableStatement.close();
        connection.close();
    }

    //类型2：从表单中获取数据，并作为值返回。存储过程：获取id对应的余额(与类型1类似)
    private static void type2() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///shiro?user=root&password=root");

        String sql="call mypro2(?,?) ";
        CallableStatement callableStatement = connection.prepareCall(sql);
        //设置参数
        callableStatement.setInt(1,1);
        //设置返回值类型
        callableStatement.registerOutParameter(2, Types.INTEGER);
        callableStatement.executeUpdate();
        //根据类型获取值
        int money = callableStatement.getInt(2);
        System.out.println("余额"+money);
        callableStatement.close();
        connection.close();

    }

    //类型3：有输入，无返回值输出，存在select语句输出
    //存储过程：输入金额，展示所有存款比此金额高的用户
    private static void type3() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///shiro?user=root&password=root");

        String sql="call mypro3(?) ";
        CallableStatement callableStatement = connection.prepareCall(sql);
        //设置参数的值
        callableStatement.setInt(1,1);
        callableStatement.executeUpdate();
        //接受存储过程select返回的值
        ResultSet resultSet = callableStatement.getResultSet() ;
        //和非存储过程一样，获取resultSet执行操作
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String account = resultSet.getString("account");
                System.out.println("id: "+id+" account "+account);
            }
        callableStatement.close();
        connection.close();

    }
}
