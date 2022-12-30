package 集合.泛型;

public class a1泛型概述 {
    public static void main(String[] args) {
        /**
         * 产生：jdk5中引入的新的特性，可以在编译阶段约束操作的数据类型，并进行检查
         * 写法：<数据类型>
         * 注意：1、只能支持引用数据类型
         *      2、如果不写泛型，类型默认为object
         *      3、指定泛型的具体类型后，传递数据时，可以传入改类型或者其子类类型
         * 泛型的好处：
         *      1、统一数据类型
         *      2、把运行时期的问题提前到了编译时期，避免了强制类型转化可能会出现的异常(默认为object)
         *哪里定义泛型：
         *      1、泛型类: 在类名后面定义泛型，创建该类对象的时候，确定类型
         *      2、泛型方法: 在修饰符后面定义方法，调用该方法的时候，确定类型
         *      3、泛型接口: 在接口名后面定义泛型，:实现类确定类型，实现类延续泛型
         *泛型的继承和通配符：
         *  泛型不具备继承性，但是数据具备继承性
         *   泛型的通配符:?
         *      ? extend E --->E及E类型的子类
         *      ? super E ---->E及E类型的父类
         * 使用场景：
         *  定义类、方法、接口的时候，如果类型不确定，就可以定义泛型
         *  如果类型不确定，但是能知道是哪个继承体系中的，可以使用泛型的通配符
         * 需要对泛型有着更加深入的了解，可查阅：https://www.bilibili.com/video/BV17F411T7Ao?p=192
         */
         MyArrayList<String> list = new MyArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);

        System.out.println("---------------------");
        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.add(123);
        list2.add(456);
        list2.add(789);
        System.out.println(list2.get(0));
        System.out.println(list2);
    }
}
