package com.test.curd.demo6_事务;

import java.sql.SQLException;

/**
 * 开启事务(关闭事务自动提交)：connection.setAutoCommit(false);
 *      PS:JDBC默认事务操作自动提交，所以要关闭，不然无意义
 * 事务提交：connection.commit();
 * 事务回滚：connection.rollback();
 * 在JDBC中使用：一般如service中体现，使用try...catch包围，有问题回滚，没问题提交
 *
 */

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        service service = new service();
        service.transfer("zs","ls",100);
    }
}
