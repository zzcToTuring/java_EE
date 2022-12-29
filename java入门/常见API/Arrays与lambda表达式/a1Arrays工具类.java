package 常见API.Arrays与lambda表达式;
//Arrays是java众多工具类中的一种，列举出几种常见的方法

import java.util.Arrays;

public class a1Arrays工具类 {
    public static void main(String[] args) {
        String a[]=new String[]{"test1","test2","test3","domain","666666"};
        //1、Arrays.toString(数组) 把数组拼接成一个字符串
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        System.out.println("----------------------");

        //2、 Arrays.binarySearch(数组，查找的元素) 二分查找法查找元素
        System.out.println(Arrays.binarySearch(a,"test2"));
        System.out.println(Arrays.binarySearch(a,"test666"));
        System.out.println("---------------------");

        //3、Arrays.copyOf(原数组，新数组长度) 拷贝数组-->数组长度过长则默认补充
        String[] b=Arrays.copyOf(a,4);
        System.out.println(Arrays.toString(b));
        System.out.println("----------------------");

        //4、Arrays.copyOfRange(原数组，起始索引，结束索引) 拷贝数组(指定范围) -->会根据数组长度默认补充
        String[] c=Arrays.copyOfRange(a,1,9);
        System.out.println(Arrays.toString(c));
        System.out.println("--------------------");

        //5、Arrays.fill(数组，元素) 填充数组
        String[] d=new String[10];
        Arrays.fill(d,"666");
        System.out.println(Arrays.toString(d));

        //6、Arrays.sort(数组)  升序排序（按照默认方式进行数组排序）
        //最常见的一种方式 但是由于此可以引出更多的思考

    }
}
