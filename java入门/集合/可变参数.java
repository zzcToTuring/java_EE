package 集合;

import java.util.Arrays;

public class 可变参数 {
    public static void main(String[] args) {
        //顾名思义，参数的数量是可变化的  举例：int...a
        /**
         * 注意点：
         *      1、接受的参数是数组类型
         *      2、形参列表中可变参数只能有一个
         *      3、可变参数必须放在参数列表的最后面
         */
        getSum(1,2,3,4,5);
    }
    public static void getSum(int a,int...o){
        System.out.println(Arrays.toString(o));
    }
}
