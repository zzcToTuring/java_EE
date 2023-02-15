package 基础提升.注解;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//模拟 Junit框架执行 加上MyTest注解 value=do执行，未加或者value不符合均不执行
public class MyDemo {
    @MyTest(value = "do")
    public void method1(){
        System.out.println("method1");
    }
    @MyTest("do")
    public void method2(){
        System.out.println("method2");
    }

    @MyTest("not")
    public void method3(){
        System.out.println("method3");
    }

    public static void main(String[] args) throws Exception{
        //创建执行对象
        MyDemo myDemo=new MyDemo();
        //获取使用class对象
        Class<?extends MyDemo> myDemoClass = myDemo.getClass();
        //获取其中的所有方法
        Method[] declaredMethods = myDemoClass.getDeclaredMethods();
        //对其中的方法进行遍历
        for (Method declaredMethod : declaredMethods) {
            declaredMethod.setAccessible(true);
            //如果方法上面有MyTest注解
            if (declaredMethod.isAnnotationPresent(MyTest.class)){
                //继续查询注解的内容
                Annotation[] annotations = declaredMethod.getAnnotations();
                //使用正则表达式进行内容解析
                Pattern compile = Pattern.compile("(MyTest\\S{2})(\\S{2,})(\")");
                Matcher matcher = compile.matcher(annotations[0].toString());
                matcher.find();
                //如果解析到value值为do，则说明要调用此方法
                if (matcher.group(2).equals("do")) {
                    declaredMethod.invoke(myDemo);
                }
            }
        }
    }
}
