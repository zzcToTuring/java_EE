package 常见API.Arrays与lambda表达式;

import java.util.Arrays;
import java.util.Comparator;

//Arrays.sort(数组) 引起的思考
public class a2sort {
    public static void main(String[] args) {
        //最简单（默认）的排序方式
        int a[]=new int[]{2,3,4,5,1};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("------------------");

        //使用 Arrays.sort(数组，规则)进行排序 -->对数组进行降序排序
        //注意 这个数组一定要是引用数据类型
        Integer b[]=new Integer[]{2,3,4,5,6,1};
        //里面的规则 需要重写Comparator方法(具体原理可以看底层源代码所实现)，所return的数值，与前端的排序方法很相似
        Arrays.sort(b, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(b));
        System.out.println("-----------------------------");

        //使用sort对student数组按照age进行排序
        student[] s=new student[3];
        s[0]=new student(20,"zhangsan");
        s[1]=new student(12,"lisi");
        s[2]=new student(11,"wangwu");
        Arrays.sort(s, new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(Arrays.toString(s));

    }
}
class student{
    int age;
    String name;

    public student() {
    }

    public student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "student{age = " + age + ", name = " + name + "}";
    }
}