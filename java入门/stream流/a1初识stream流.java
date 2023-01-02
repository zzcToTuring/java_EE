package stream流;

import java.util.ArrayList;
import java.util.function.Consumer;

public class a1初识stream流 {
    public static void main(String[] args) {
        /**
         * 作用：用于简化集合、数组的一些操作
         * 使用步骤：
         *  1、先得到一条stream流，并把数据放上去
         *  2、利用stream流中的api进行各种操作
         *
         * 举例：
         *    创建集合添加元素，完成以下需求：
         *             1.把所有以“张”开头的元素存储到新集合中
         *             2.把“张”开头的，长度为3的元素再存储到新集合中
         *             3.遍历打印最终结果
         */
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<String> list3=new ArrayList<>();
        list1.add("张无忌");
        list1.add("周芷若");
        list1.add("赵敏");
        list1.add("张强");
        list1.add("张三丰");
        
        //使用之前的方法
        for (String s : list1) {
            if (s.startsWith("张")){
                list2.add(s);
            }
        }
        list2.forEach(s->{
            if (s.length()==3){
                list3.add(s);
            }
        });
        System.out.println(list3);

        //使用stream的方法
        list1.stream().filter(name->name.startsWith("张")).filter(name->name.length()==3).forEach(System.out::println);
        //stream流的原始方法
        list1.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                if (s.startsWith("张")&&s.length()==3){
                    System.out.println("s-->"+s);
                }
            }
        });
    }
}
