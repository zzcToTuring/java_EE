package 集合.list;

import java.util.ArrayList;
import java.util.List;

public class a1list系列特有方法 {
    public static void main(String[] args) {
         /*

        List系列集合独有的方法：
            void add(int index,E element)       在此集合中的指定位置插入指定的元素
            E remove(int index)                 删除指定索引处的元素，返回被删除的元素
            E set(int index,E element)          修改指定索引处的元素，返回被修改的元素
            E get(int index)                    返回指定索引处的元素
        */

        //1.创建一个集合
        List<String> list = new ArrayList<>();

        //2.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");


        //void add(int index,E element)       在此集合中的指定位置插入指定的元素
        //细节：原来索引上的元素会依次往后移
        //list.add(1,"QQQ");


        //list的删除方法--->索引删除
        //E remove(int index)                 删除指定索引处的元素，返回被删除的元素
        //String remove = list.remove(0);
        //System.out.println(remove);//aaa

        //list的删除方法--->根据内容删除（此时的string是包装类）
        String temp=String.valueOf("bbb");
        list.remove(temp);

        //E set(int index,E element)          修改指定索引处的元素，返回被修改的元素
        //String result = list.set(0, "QQQ");
        //System.out.println(result);

        // E get(int index)                    返回指定索引处的元素
        String s = list.get(1);
        System.out.println(s);

        //展示
        System.out.println(list);
    }
}
