package 创造型模式.单例模式;
//使用静态内部类进行创建
//类似于饿汉式，但不会浪费内存，是推荐使用的一种方式
public class Test04 {
    public static void main(String[] args) {
    Singleton04 test1=Singleton04.getInstance();
    Singleton04 test2=Singleton04.getInstance();
    System.out.println(test1==test2);
    }
}
class Singleton04{
    //初始化封装
    private static volatile Singleton04 instance;
    private Singleton04(){}
    //在类里面写一个静态的内部类
    private static class Singleton04Instance{
        private static final Singleton04 INSTANCE=new Singleton04();
    }
    public static synchronized Singleton04 getInstance(){
        return  Singleton04Instance.INSTANCE;
    }
}
