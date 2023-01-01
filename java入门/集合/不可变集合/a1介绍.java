package 集合.不可变集合;

import java.util.List;
import java.util.Map;

public class a1介绍 {
    public static void main(String[] args) {
        /**
         * 不可变集合(在jdk17版本中使用)：
         *      不能添加，不能删除，不能修改
         * 在list，set，map接口中，都存在静态的of方法，可以获取一个不可变的集合
         *  static<E> List<E> of(E...elements) 创建一个具有指定元素的list集合对象
         *  static<E> Set<E> of(E...elements) 创建一个具有指定元素的Set集合对象
         *  static<K,V> Map<K,V> of(E...elements) 创建一个具有指定元素的map集合对象
         *
         * 三种方式的细节：
         *  list：直接用
         *  set：元素不能重复
         *  Map:元素不能重复，键值对数最多是10个（超过10个需要使用ofEntries方法）
         */
        List<String> list=List.of("zs","ls","ww");
        for (String s : list) {
            System.out.println(s);
        }
        //list.remove("ls");//不能删除 因为这是不可变集合
        Map<String,String> map=Map.of("zs","ls");

    }
}
