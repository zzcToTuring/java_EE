package 反射.课程补充;

import java.io.Serializable;

public class T2_哪些类型有class对象 {
    //外部类 成员内部类 静态内部类 局部内部类 匿名内部类 接口 数组 枚举 注解 基本数据类型 void
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<String> stringClass = String.class;//外部类
        Class<Serializable> serializableClass = Serializable.class;//接口
        Class<Integer[]> aClass = Integer[].class;//数组
        Class<float[][]> aClass1 = float[][].class;//二维数组
        Class<Deprecated> deprecatedClass = Deprecated.class;//注解
        Class<Thread.State> stateClass = Thread.State.class;//枚举
        Class<Long> longClass = long.class;//基本数据类型
        Class<Void> voidClass = void.class;//void数据类型
        Class<Class> classClass = Class.class;//外部类

    }
}
