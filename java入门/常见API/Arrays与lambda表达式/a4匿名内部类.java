package 常见API.Arrays与lambda表达式;
//在之前学习了lambda表达式之后，应该能使用简单匿名内部类完成实际的需求

public class a4匿名内部类 {
    // 这个方法必须传递swim接口 但我仅仅需要写一次，如果创建对象去写的话会显得有点麻烦，这个时候就可以使用匿名内部类了
    public static void method(swim s){
        s.swim();
    }
    public static void main(String[] args) {
    //最基本的写法
        method(new swim() {
            @Override
            public void swim() {
                System.out.println("匿名内部类中重写swim");
            }
        });
        //使用lambda表达式进行简化 简化了从new开始到括号内的内容 如果有形参的话，形参写到括号中即可
        method(()->{
            System.out.println("使用lambda表达式进行简化");
        });

        method(()-> System.out.println("lambda表达式还能简写"));
    }

}


interface swim{
    public abstract void swim();
}
/**
 * lambda表达式还能简写
 * 1、参数类型可以省略不写（在之前的demo中已经实现了）
 * 2、如果只有一个参数，参数类型可以省略，同时()也能省略
 * 3、如果lambda表达式的方法体只有一行，那么大括号，分号，return可以省略不写，但注意要都省略
 */