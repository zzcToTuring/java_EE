package stream流;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class a5stream流的终结方法 {
    public static void main(String[] args) {
        /**
         * void forEach(Consumer action)  遍历
         * long count() 统计
         * toArray() 收集流中的数据，放到数组中
         * collect(Collector collector) 收集流中的数据，放到集合中
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

        //遍历在之前的代码中已经使用过，就不多做展示了
        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                //具体的代码省略
            }
        });
        list.stream().forEach(s->{
            //具体的代码省略
        });

        //count统计个数
        System.out.println(list.stream().count());

        /**
         * toArray() 收集流中的数据，放到数组中
         * toArray方法参数的作用：负责创建一个指定类型的数组
         * toArray方法的底层：会一次得到流里面的每一个数据，并把数据放到数组中
         * toArray方法的返回值：是一个装着流里面所有的数据的数组
         */
        System.out.println(Arrays.toString(list.stream().toArray()));
        String[] arr=list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                System.out.println("value"+"  "+value);
                return new String[value];
            }
        });
       //使用简单的方式进行处理
        String[] arr2=list.stream().toArray(value -> new String[value]);
    }
}
