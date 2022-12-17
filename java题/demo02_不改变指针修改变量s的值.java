import java.lang.reflect.Field;
//保证s的指针不变的情况下，修改s的值
public class demo02_不改变指针修改变量s的值 {
    public static void main(String[] args)throws Exception {
        //思路 不能改动s 的指针，利用的方法是反射
        String s = "abc";
        Class c=s.getClass();

        Field value=c.getDeclaredField("value");
        value.setAccessible(true);
        value.set(s,"abcd".toCharArray());
        System.out.println(s);
        //理解：string也是众多类中的一个类，string里面也有众多的方法
        //首先利用反射获得string类，然后获得string类中的value方法
        //value方式是私有的成员变量，需要使用getDeclaredField方法获取，同时也要使用setAccessible
        //接下来就相当与已知一个私有的成员变量，需要使用反射去修改他的值了
        //利用反射修改，没有改变s的内存地址，是符合要求的。需要对string类有着深刻的了解
        //value.set(对象，设置的值)，由于本身就是在string类中进行操作，需要使用toCharArray()进行添加操作
    }
}
