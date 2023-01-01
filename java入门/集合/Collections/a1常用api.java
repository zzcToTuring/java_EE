package 集合.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class a1常用api {
    public static void main(String[] args) {
        /**
         * collections不是集合，是集合的工具类，常用的api如下
         * public static <T> boolean addAll(Collection<T> c,T...elements) 批量添加元素
         * public static void shuffle(List<?> list) 打乱list集合元素的顺序
         * public static <T> void sort(List<T> list) 排序
         * public static <T> void sort(List<T> list,Comparator<T> c) 根据指定的规则进行排序
         * public static <T> int binarySearch(List<T> list,T key) 以二分查找法查找元素
         * public static <T> void copy(List<T> dest,List<T> src) 拷贝集合中的元素
         * public static <T> int full(List<T> list,T obj)  使用指定的元素填充集合
         * public static <T> void max/min(Collection<T> coll) 根据默认的自然排序获取最大/小值
         * public static <T> void swap(List<?> list,int i,int j) 交换集合中指定位置的元素
         *
         */
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"1","2","3");
        System.out.println(list);
    }
}
