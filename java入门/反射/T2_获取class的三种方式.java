package 反射;

import 反射.javabean.student;

public class T2_获取class的三种方式 {
    /**
     * 1、Class.forName("全类名")--->常用
     * 2、类名.class--->一般很少用，参考synchronized (T2.class)
     * 3、对象.getClass()--->只有创建对象才能用
     */
    public static void main(String[] args) throws Exception {
        //方法一
        Class aClass = Class.forName("反射.javabean.student");
        //方法二
        Class bClass = student.class;
        //方法三
        student s=new student();
        Class cClass = s.getClass();
        System.out.println(aClass==bClass);
        System.out.println(bClass==cClass);
    }
}


