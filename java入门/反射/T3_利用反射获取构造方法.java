package 反射;

import 反射.javabean.student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class T3_利用反射获取构造方法 {
    /**
     * 利用反射获取构造方法:
     * Constructor<?>[] getConstructors(): 返回所有公共构造方法对象的数组
     * Constructor<?>[] getDeclaredConstructors(): 返回所有构造方法对象的数组
     * Constructor<T>getConstructor(Class<?>... parameterTypes): 返回单个公共构造方法对象
     * Constructor<T>getDeclaredConstructor(Class<?>... parameterTypes): 返回单个构造方法对象
     *
     * 获取到构造方法后，可查阅其类型(public private) con.getModifiers()
     * 返回的类型是int 可参考api文档 java.lang.reflect.Modifier
     * abstract=1024 final=16 native=256 private=2 public=1 static=0 strict=2048
     * synchronized=32 transient=128 volatile=64
     *
     *
     * Constructor类中用于创建对象的方法---》 T newInstance(Object...):
     * 根据指定的构造方法创建对象  setAccessible(boolean flag):设置为true,表示取消访问检查
     *
     */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //首先获取class对象
        Class<?> clazz = Class.forName("反射.javabean.student");
        //获取构造方法--->返回所有公共
        Constructor[] con1 = clazz.getConstructors();
        //获取构造方法--->返回所有
        Constructor[] con2 = clazz.getDeclaredConstructors();
        //获取构造方法--->指定获取公共且有一个string类型的参数
        Constructor con3 = clazz.getConstructor(String.class);
        //获取构造方法--->获取 String int类型的参数
        Constructor con4 = clazz.getDeclaredConstructor(String.class, int.class);
        //查看con4的参数类型
        Class[] parameterTypes = con4.getParameterTypes();
        //查看con3的修饰符
        int modifiers = con3.getModifiers();
        //我都获得构造方法了，那么用它创建一个对象不过分吧 他是私有的，先要去除修飾符
        con4.setAccessible(true);
        student s = (student) con4.newInstance("张三", 23);
        System.out.println(s);

    }
}
