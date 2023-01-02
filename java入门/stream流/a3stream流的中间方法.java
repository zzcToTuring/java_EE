package stream流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class a3stream流的中间方法 {
    public static void main(String[] args) {
        /**
         * Stream<T> filter(Predicate<? super T> predicate) 过滤
         * Stream<T> limit(long maxSize) 获取前几个元素
         * Stream<T> skip(long n) 跳过前几个元素
         * Stream<T> distinct() 元素去重，依赖hashCode和equals方法（自定义类一定要重写）
         * static<T> Stream<T> concat(Stream a, Stream b) 合并a,b两个流为一个流
         * Stream<R> map(Function<T,R> mapper) 转化流中的数据类型
         * 注意点：
         *  1、中间方法会返回新的流（可以使用链式编程），原来的stream流只能使用一次
         *  2、修改stream流中的数据，不会影响原来集合或者数组中的数据
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");
        ArrayList<String> list2=new ArrayList<>();
        Collections.addAll(list2,"王二麻子","谢广坤");

        //filter 过滤 把张开头的留下，其他的数据过滤不要
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //如果返回true 表示留下；否则不要
                return s.startsWith("张");
            }
        }).forEach(s-> System.out.println(s));
        System.out.println("--------------------------");
        //limit获取前3个元素 3表示3个元素的意思 并不是索引
        list.stream().limit(3).forEach(s-> System.out.println(s));
        System.out.println("-----------------------");
        //skip表示跳过的意思 3同样也表示3个元素并不是索引
        list.stream().skip(3).forEach(s-> System.out.println(s));
        //distinct表示去重
        list.add("谢广坤");
        list.stream().distinct().forEach(s -> System.out.print(s+"    "));
        //concat合并 如果两个数据类型不同，则默认为他们共同的父类
        Stream.concat(list.stream(),list2.stream()).forEach(s -> System.out.print(s));


    }
}
