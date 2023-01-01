package 集合.双列集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class a2Map的遍历方法 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("zs",20);
        map.put("ls",22);
        map.put("ww",23);
        //遍历的方式1--->根据键找值
        //原理都是大致相同的，获取到相关的key值遍历 与list遍历机制相同
        Set<String> s=map.keySet();
        for (String s1 : s) {
            System.out.println(s1+"  "+map.get(s1));
        }
        s.forEach((s2)->{
            System.out.println(s2+"  "+map.get(s2));
        });
        System.out.println("-------------------------------");
        //遍历方式2-->键值对 通过一个方法获取所有的键值对对象，返回一个set集合
        Set<Map.Entry<String,Integer>> entries=map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+"    "+entry.getValue());
        }
        System.out.println("------------------");
        //遍历方式3--->lambda表达式
        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s+"   "+integer);
            }
        });
        map.forEach((key,value)->{
            System.out.println(key+"   "+value);
        });
    }
}
