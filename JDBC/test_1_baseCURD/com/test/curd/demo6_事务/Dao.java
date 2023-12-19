package com.test.curd.demo6_事务;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 具体数据库操作层 DAO
 */
public class Dao {
    public int addMoney(String account, int money,Connection connection) throws ClassNotFoundException, SQLException {
        String sql = "update t_bank set money = money + ? where account = ? ;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, money);
        preparedStatement.setString(2, account);
        int rows = preparedStatement.executeUpdate();
        System.out.println("加钱执行完毕!");
        preparedStatement.close();
        return rows;
    }

    public int subMoney(String account, int money,Connection connection) throws ClassNotFoundException, SQLException {
        String sql = "update t_bank set money = money - ? where account = ? ;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, money);
        preparedStatement.setString(2, account);
        int rows = preparedStatement.executeUpdate();
        System.out.println("减钱执行完毕!");
        preparedStatement.close();
        return rows;
    }
}
