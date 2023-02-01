package 反射;

import 反射.javabean.student;

import java.lang.reflect.Field;

public class T4_利用反射获取成员变量 {
    /**
     * class类中用于获取成员变量的方法
     * Field[] getFields():返回所有公共成员变量对象的数组
     * Field[] getDeclaredFields():返回所有成员变量对象的数组
     * Field getField(String name):返回单个公共成员变量对象
     * Field getDeclaredField(String name):返回单个成员变丹对象
     * Field类中用于创建对象的方法
     * void set(Object obj，object value): 赋值
     * Object get(object obj) 获取值
     */
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("反射.javabean.student");
        //获取所有的成员变量
        Field[] declaredField =clazz.getDeclaredFields();
        //获取成员变量name与age
        Field name = clazz.getDeclaredField("name");
        Field age = clazz.getDeclaredField("age");
        //查看成员变量name的修饰符
        System.out.println(name.getModifiers());
        //查看成员变量age的名字（虽然感觉写废话一样）
        System.out.println(age.getName());
        //查看成员变量age的类型
        System.out.println(age.getType());

        student s=new student("张三");
        //获取s对象中，name的值 如果get方法为public，直接s.get即可 但是为private，就要使用反射了
        name.setAccessible(true);
        System.out.println(name.get(s));
        //修改name的值--->不是走set 直接修改--->如果用final修饰了 神仙来了也不能修改了
        name.set(s,"Ab");
        System.out.println(name.get(s));
    }
}
