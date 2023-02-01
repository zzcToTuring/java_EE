package 反射.课程补充;

import 反射.javabean.student;

public class T1_class的获取方法_类加载器 {
    public static void main(String[] args) throws Exception {
        //在之前有三种方法能创建class，这是第四种，通过类加载器获取
        dog dog = new dog();
        student s = new student();
        Class<?> aClass1 = s.getClass();
        /**
         * 通过类加载器（任何对象的class中都有获取加载器对象）
         * 所以只要获取到了类加载对象，导入相关的类，就能获取Class对象
         * dog与student无联系，特意用dog类去调用
         */

        ClassLoader classLoader = dog.getClass().getClassLoader();
        Class<?> aClass3 = classLoader.loadClass("反射.javabean.student");
        //输出代表他们是同一个类
        System.out.println(aClass1.hashCode());

        System.out.println(aClass3.hashCode());

    }


}
class dog{}
