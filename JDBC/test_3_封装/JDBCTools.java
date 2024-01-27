//JDBC使用：注册驱动、获取连接，回收资源属于固定写法，可封装工装类方便书写

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * (扩展)ThreadLocal的介绍：线程本地变量：为同一个线程存储共享变量
 *      1、ThreadLocal对象.get: 获取ThreadLocal中当前线程共享变量的值。
 *      2、ThreadLocal对象.set: 设置ThreadLocal中当前线程共享变量的值。
 *      3、ThreadLocal对象.remove: 移除ThreadLocal中当前线程共享变量的值.
 */
public class JDBCTools {
    private static DataSource ds;
    private static ThreadLocal<Connection> tl = new ThreadLocal<>();
    //静态代码块，创建Druid数据源并导入配置文件
    static {
        Properties pro = new Properties();
        try {
            pro.load(ClassLoader.getSystemResourceAsStream("druid.properties"));
            ds= DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        Connection connection = tl.get();
        if(connection  == null){//当前线程还没有拿过连接，就给它从数据库连接池拿一个
            connection = ds.getConnection();
            tl.set(connection);
        }
        return connection;
    }

    public static void free() throws SQLException {
        Connection connection = tl.get();
        if(connection != null){
            tl.remove();
            connection.setAutoCommit(true);//避免还给数据库连接池的连接不是自动提交模式（建议）
            connection.close();
        }
    }

}
