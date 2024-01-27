import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;

public abstract class baseDao {
    //基于增加、删除、修改操作的 baseDao
    protected int update(String sql,Object... arg) throws SQLException {
        Connection connection = JDBCTools.getConnection();
        PreparedStatement ps_dql = connection.prepareStatement(sql);
        if (arg!=null && arg.length>0){
            for (int i = 1; i <= arg.length; i++) {
                ps_dql.setObject(i,arg[i-1]);
            }
        }
        int result=ps_dql.executeUpdate();
        ps_dql.close();
        if (connection.getAutoCommit()){
            JDBCTools.free();
        }
        return result;
    }
    //查询类baseDao(T是类的泛型)
    protected <T> ArrayList<T> query(Class<T> clazz, String sql, Object... args) throws Exception {
        Connection connection = JDBCTools.getConnection();
        PreparedStatement ps = connection.prepareStatement(sql);
        //设置拼接sql
        if(args != null && args.length>0){
            for(int i=1; i<=args.length; i++) {
                ps.setObject(i, args[i-1]);//?的编号从1开始，不是从0开始，数组的下标是从0开始
            }
        }
        //设置结果集及相关内容
        ArrayList<T> list = new ArrayList<>();
        ResultSet res = ps.executeQuery();
        ResultSetMetaData metaData = res.getMetaData();
        int columnCount = metaData.getColumnCount();

        //结果集处理
        while (res.next()){
            //创建这个类的无参构造方法，理解为空的Javabean
            T t = clazz.newInstance();
            //循环放入其中
            for (int i = 0; i < columnCount; i++) {
                Object value =res.getObject(i+1);
                String columnName=metaData.getColumnLabel(i+1);
                //利用反射，将一些值放入Javabean中
                Field declaredField = clazz.getDeclaredField(columnName);
                declaredField.setAccessible(true);
                declaredField.set(t, value);
            }
            list.add(t);
        }
        return list;
    }
}
