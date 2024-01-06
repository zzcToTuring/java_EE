import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.sql.*;

public class demo1_druid {
    public static void main(String[] args) throws SQLException {
        //连接池对象
        DruidDataSource druidDataSource = new DruidDataSource();
        //四个必须设置的参数
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");
        druidDataSource.setUrl("jdbc:mysql:///shiro");
        //可选参数(更多参数进入官网查询)
        druidDataSource.setInitialSize(5);//初始化数量
        druidDataSource.setMaxActive(10);//最大数量
        //进行连接
        DruidPooledConnection connection = druidDataSource.getConnection();

        //简单查询操作
        String sql="select * from t_user";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        ResultSetMetaData metaData = resultSet.getMetaData();
        while (resultSet.next()){
            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                System.out.print("   "+resultSet.getString(metaData.getColumnLabel(i)));
            }
            System.out.println();
        }

        //回收连接
        connection.close();

    }
}
