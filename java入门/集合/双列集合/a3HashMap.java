package 集合.双列集合;

import java.util.HashMap;
import java.util.Map;

public class a3HashMap {
    public static void main(String[] args) {
        /**
         * hashMap的特点：
         *  1、是map里面的一个实现类，没有特定的方法，直接使用map中的方法即可
         *  2、无序、不重复、无索引
         *  3、与HashSet底层原理是一模一样的，都是哈希表结构
         *  4、依赖hashCode方法和equals方法确保键的唯一。
         *      如果键存储的是自定义对象，需要重写hashCode和equals方法
         *      如果值存储自定义对象，不需要重写hashCode和equals方法
         *  底层源码的学习：https://www.bilibili.com/video/BV1yW4y1Y7Ms?p=14
         */
        Map<String,Integer> map=new HashMap<>();
        map.put("zhangsan",20);
        map.put("lisi",23);
        map.put("王五",27);
        System.out.println(map);
        map.remove("lisi");
        System.out.println(map);
    }
}
