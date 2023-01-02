package stream流;

import java.util.HashMap;
import java.util.stream.Stream;

public class a2不同类型的stream方法 {
    public static void main(String[] args) {
        /**
         * 单列集合 default Stream<E> stream()  --->collection中的默认方法
         * 双列集合   --->需要转化为单列集合才能使用stream流
         * 数组  public static <T> Stream<T> stream(T[] array) Arrays工具类中的静态方法
         * 其他零散的数据 public static <T> Stream<T> of(T...values) stream接口中的静态方法
         */
        //双列集合的流
        HashMap<String,Integer> hm = new HashMap<>();
        //2.添加数据
        hm.put("aaa",111);
        hm.put("bbb",222);
        hm.put("ccc",333);
        hm.put("ddd",444);

        //双列集合-->第一种获取stream流
        //hm.keySet().stream().forEach(s -> System.out.println(s));
        //双列集合--->第二种获取stream流
        hm.entrySet().stream().forEach(s-> System.out.println(s));

        //数组创建流
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        String[] arr2 = {"a","b","c"};
        //获取stream流
        // Arrays.stream(arr1).forEach(s-> System.out.println(s));
        //Arrays.stream(arr2).forEach(s-> System.out.println(s));
        //注意：
        //Stream接口中静态方法of的细节
        //方法的形参是一个可变参数，可以传递一堆零散的数据，也可以传递数组
        //但是数组必须是引用数据类型的，如果传递基本数据类型，是会把整个数组当做一个元素，放到Stream当中。
        Stream.of(arr1).forEach(s-> System.out.println(s));//[I@41629346

        //一些零散数据的stream流
        Stream.of(1,2,3,4,5).forEach(s-> System.out.println(s));
        Stream.of("a","b","c","d","e").forEach(s-> System.out.println(s));


    }
}
