package com.test.curd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class demo5_扩展_批量执行语句 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //url需要加上rewriteBatchedStatements=true
        Connection connection = DriverManager.getConnection("jdbc:mysql:///shiro?rewriteBatchedStatements=true","root","root");
        String sql = "insert into t_user (account,password,nickname) values (?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        //执行1000次插入语句
        for (int i = 0; i < 1000; i++) {
            statement.setObject(1, "test_user4" + i);
            statement.setObject(2, "1111");
            statement.setObject(3, "批量导入用户");
            //没有立即执行，而是进行拼接操作
            statement.addBatch();
        }
        //拼接完成了，可以开始执行了
        //原理：之前都是建立很多次连接，分别发送；现在直接拼接完成后发送一次，可大大节约时间
        //只有增、删、改能执行这样的操作，查询不能进行批量查询
        statement.executeBatch();
        statement.close();
        connection.close();
    }
}
