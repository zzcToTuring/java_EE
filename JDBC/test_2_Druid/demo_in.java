import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Properties;

public class demo_in {
    public static void main(String[] args) throws Exception{
        //不直接在java代码中编写配置文件，利用工厂模式，传入配置文件，创建连接池的方式配置数据源
        Properties properties = new Properties();
        InputStream is = demo2_druid.class.getClassLoader().getResourceAsStream("druid.properties");
        properties.load(is);
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        //使用in类型
        String sql="select * from t_user where id in(?,?)";
        Connection connection = dataSource.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,1);
        preparedStatement.setInt(2,2);
        ResultSet resultSet = preparedStatement.executeQuery();
        ResultSetMetaData metaData = resultSet.getMetaData();
        while (resultSet.next()){
            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                System.out.print("   "+resultSet.getString(metaData.getColumnLabel(i)));
            }
            System.out.println();
        }

    }
}
