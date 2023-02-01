package 反射;

import 反射.javabean.student;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class T5_利用反射获取成员方法 {
    /**
     * Class类中用于获取成员方法的方法
     * Method[] getMethods(): 返回所有公共成员方法对象的数组，包括继承的
     * Method[] getDeclaredMethods(): 返回所有成员方法对象的数组，不包括继承的
     * Method getMethod(String name, Class<?>... parameterTypes): 返回单个公共成员方法对象
     * Method getDeclaredMethod(String name,Class<?>... parameterTypes): 返回单个成员方法对象
     * Method类中用于创建对象的方法
     * Object invoke(Object obj, Object... args): 运行方法
     * 参数一:用obj对象调用该方法
     * 参数二:调用方法的传递的参数(如果没有就不写)
     * 返回值:方法的返回值(如果没有就不写)
     */
    public static void main(String[] args) throws Exception{
        Class clazz = Class.forName("反射.javabean.student");
        //获取里面所有的公共方法--->包括父类的公共方法
        Method[] method1 = clazz.getMethods();
        //获取里面所有的方法，但是不能获取父类的方法
        Method[] method2 = clazz.getDeclaredMethods();
        //获取指定的方法，后面需要添加参数，为了避免多态的情况
        Method eat = clazz.getDeclaredMethod("eat", String.class);
        //获取成员修饰符与名字
        System.out.println(eat.getName()+"成员修饰符: "+eat.getModifiers());
        //获取方法的形参
        Parameter[] parameters = eat.getParameters();
        //获取方法签名中的异常
        Class<?>[] exceptionTypes = eat.getExceptionTypes();
        //方法运行 如果有返回值可以用变量接收
        student s=new student();
        eat.setAccessible(true);
        eat.invoke(s        //参数的调用者
                ,"面包"//参数的实际对象
        );
        //获取返回值类型
        System.out.println(eat.getReturnType());

    }

}

