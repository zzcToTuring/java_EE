package 反射.案例;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Field;

public class E1_打印对象的字段名与值 {
    //对于任意一个对象，都可以把对象所有的字段名和值，保存到文件中去
    public static void main(String[] args) {
        student s=new student("张三",23,"男","睡觉");
        try {
            saveObject(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //把对象
    private static void saveObject(Object s) throws Exception{
        Class Clazz = s.getClass();
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\java_code\\java_EE\\java入门\\反射\\案例\\E1_out.txt"));
        //获取所有的成员变量
        Field[] Fields = Clazz.getDeclaredFields();
        for (Field field : Fields) {
            field.setAccessible(true);
            String name=field.getName();
            Object value=field.get(s);
            bw.write(name+"="+value);
            bw.newLine();
        }
        bw.close();
    }

}
