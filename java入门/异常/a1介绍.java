package 异常;

public class a1介绍 {
    public static void main(String[] args) {
        /**
         * 异常是什么：程序中可能出现的问题
         * 异常的分类：
         *      异常的父类：exception
         *      编译时异常：没有继承RuntimeException，直接继承于exception，编译阶段就会错误提示
         *      运行时异常：RuntimeException本身和子类；在编译阶段没有错误提醒，运行时出现的
         *  作用：
         *      1、异常是用来查询bug的关键参考信息
         *      2、异常可以作为方法内部的一种特殊返回值，以便通知调用者底层的执行情况
         *
         *  JVM默认处理异常的方式：
         *             1. 把异常的名称，异常原因及异常出现的位置等信息输出在了控制台
         *             2. 程序停止执行，异常下面的代码不会再执行了
         */
        //编译时异常(在编译阶段，必须要手动处理，否则代码报错)
        //解决方式 使用try...catch或在main函数上throws ParseException
        /*String time = "2030年1月1日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(time);
        System.out.println(date);*/

        //运行时异常（在编译阶段是不需要处理的，是代码运行时出现的异常）
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[10]);//ArrayIndexOutOfBoundsException

    }
}
