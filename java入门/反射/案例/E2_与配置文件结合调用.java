package 反射.案例;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class E2_与配置文件结合调用 {
    //反射可以和配置文件结合的方式，动态的创建对象，并调用方法
    public static void main(String[] args) throws Exception{
        //使用prop加载资源文件的方式
        Properties properties = new Properties();
        FileInputStream fs=new FileInputStream(new File("java入门/反射/案例/prop.properties"));
        properties.load(fs);
        fs.close();
        //获取类名与方法名
        String classname = (String) properties.get("classname");
        String method = (String) properties.get("method");
        //利用反射进行操作
        Class<?> aClass = Class.forName(classname);
        //创建对象
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        Object o = declaredConstructor.newInstance();
        //获取方法
        Method method1 = aClass.getDeclaredMethod(method);
        method1.setAccessible(true);
        method1.invoke(o);
    }
}
