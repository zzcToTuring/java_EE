package com.test.curd.demo6_事务;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class service {
    public void transfer(String addAccount,String subAccount, int money) throws ClassNotFoundException, SQLException {
        System.out.println("addAccount = " + addAccount + ", subAccount = " + subAccount + ", money = " + money);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///shiro", "root", "root");
        int flag = 0;
        //利用try代码块,调用dao
        try {
            //开启事务(关闭事务自动提交)
            connection.setAutoCommit(false);

            Dao bankDao = new Dao();
            bankDao.addMoney(addAccount,money,connection);
            System.out.println("--------------");
            bankDao.subMoney(subAccount,money,connection);
            flag = 1;
            //不报错,提交事务
            connection.commit();
        }catch (Exception e){
            //报错回滚事务
            connection.rollback();
            System.out.println("程序执行出现错误，操作撤销");
            throw e;
        }finally {
            connection.close();
        }

        if (flag == 1){
            System.out.println("转账成功!");
        }else{
            System.out.println("转账失败!");
        }
    }

}
