package 集合.set;

import java.util.TreeSet;

public class a4TreeSet {
    public static void main(String[] args) {
        /**
         * 特点：不重复，无索引，可排序（按照元素的默认规则进行排序）
         *      底层是基于红黑树的数据结构实现排序的，增删改查性能都比较好
         *
         * TreeSet的两种比较方式
         *  1、默认排序/自然排序：Javabean类实现comparable接口指定比较规则
         *      （
         *      对数值类型：integer,double默认按照从小到大的顺序进行排序
         *      对字符，字符串类型：按照字符在ASCII码表中的数字升序进行排序
         *      ）
         *  2、比较器排序：创建treeSet对象时候，传递比较器comparator指定规则
         *  如果在代码中既有第一种也有第二种，默认以第二种为准
         *
         *  treeSet方法返回值的特点：
         *    return
         *      负数：表示当前要添加的元素是小的，存在左边
         *      正数：表示当前要添加的元素是大的，存右边
         *      0：表示当前要添加的元素已经存在，舍弃
         */

        //默认是升序，这里是传入比较器重写规则了
//        TreeSet<Integer> t=new TreeSet(new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return (Integer) o2-(Integer) o1;
//            }
//        });
        //使用lambda表达式进行简化操作
        TreeSet<Integer> t=new TreeSet((o1,o2)->(Integer) o2-(Integer) o1 );
        t.add(2);
        t.add(1);
        t.add(3);
        System.out.println(t);

        System.out.println("--------------------------------");
        Student s1=new Student("zhangsan",22);
        Student s2=new Student("lisi",24);
        Student s3=new Student("wangwu",25);
        TreeSet<Student> students=new TreeSet<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        System.out.println(students);

    }
}
