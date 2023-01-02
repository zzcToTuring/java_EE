package stream流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class a4Stream流的map方法 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-15", "周芷若-14", "赵敏-13", "张强-20", "张三丰-100", "张翠山-40", "张良-35", "王二麻子-37", "谢广坤-41");
        /**
         * 第一个类型：流中原本的数据类型
         * 第二个参数：要转成之后的类型
         */

    list.stream().map(new Function<String, Integer>() {
        @Override
        public Integer apply(String s) {
            String[] arr=s.split("-");
            String age_String=arr[1];
            int age=Integer.parseInt(age_String);
            return age;
        }
    }).forEach(s-> System.out.print(s+"  "));

    //使用简写的方式
        list.stream()
                .map(s->Integer.parseInt(s.split("-")[1]))
                .forEach(s-> System.out.println(s));
    }
}
