package 常见API.Arrays与lambda表达式;

import java.util.Arrays;

public class a3lambda表达式 {
    public static void main(String[] args) {
        //在a2.java中对sort已经有所了解，其中的new Cxx是使用的内部类的方式
        //使用lambda表达式能对其进行省略，还是拿a2.java中排序的案例

        Integer a[]=new Integer[]{3,2,1,4,6};
        Arrays.sort(a,(Integer q,Integer w)->{
            return w-q;
        });

//        Arrays.sort(a,(q,w)->w-q);//表达式的简写方式
        System.out.println(Arrays.toString(a));
    }
}
/**
 * lambda表达式是jdk8开始后的一种新的语法形式
 * 1、是可以用来集繁华匿名内部类的书写
 * 2、只能简化函数式接口的匿名内部类的写法
 * 3、函数式接口
 *      有且仅有一个抽象方法的接口叫做函数式接口，接口上方可以加@FunctionalInterface注解
 *
 * 使用lambda表达式的好处：
 *   lambda是一个匿名函数，我们可以把lambda表达式理解成一段可以传递的代码，他可以写出更简洁，更灵活的代码
 *   作为一种更紧凑的代码风格，使java语言表达能力得到了提升
 */