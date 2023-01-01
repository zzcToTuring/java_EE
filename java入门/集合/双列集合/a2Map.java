package 集合.双列集合;

import java.util.HashMap;
import java.util.Map;

public class a2Map {
    public static void main(String[] args) {
        /**
         * Map是双列集合的顶层接口，它的功能是全部双列集合都是可以继承使用的
         * V put(k key,V value) 添加元素
         * V remove(Object key) 根据键删除键值对元素
         * void clear() 移除所有的键值对元素
         * Boolean containsKey(object key) 判断集合是否包含指定的键
         * Boolean containsValue(object value) 判断集合是否包含指定的值
         * Boolean isEmpty() 判断集合是否为空
         * int size() 集合的长度，也就是集合中键值对的个数
         */
        //注意：在添加数据的时候，如果键不存在，那么会直接把键值对对象添加到map集合分钟，方法返回null
        //在添加的时候，如果键是存在的，那么会把原有的键值对对象覆盖，会把覆盖的值进行返回
        Map<String,Integer> map=new HashMap<>();
        System.out.println(map.put("张三", 20));
        System.out.println(map);
        System.out.println(map.put("张三", 66));
        System.out.println(map);



    }
}
