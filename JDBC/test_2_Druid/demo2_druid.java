import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class demo2_druid {
    public static void main(String[] args) throws Exception {
        //不直接在java代码中编写配置文件，利用工厂模式，传入配置文件，创建连接池的方式配置数据源
        Properties properties = new Properties();
        InputStream is = demo2_druid.class.getClassLoader().getResourceAsStream("druid.properties");
        properties.load(is);
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        //查询demo 查询id为1的密码
        Connection connection = dataSource.getConnection();
        String sql="select password from t_user where id=1";
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery(sql);
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("password"));
        }
        connection.close();
    }
}
