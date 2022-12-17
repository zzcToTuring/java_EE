package 创造型模式.单例模式;

public class Test01 {
    public static void main(String[] args) {
        singleton test1=singleton.getInstance();
        singleton test2=singleton.getInstance();
        System.out.println(test1==test2);
    }
}
//饿汉式（静态变量）
class singleton{
    private singleton(){
    }
    //2、本类内部创建对象实例
    private final static singleton instance=new singleton();

    //3、创建外部接口
    public static singleton getInstance(){
        return instance;
    }
}
/*
饿汉式的另外一种表现形式
class singleton{
    //1、构造器私有化，在外部不能new
    private singleton(){

    }
    //2、最终变量

    private  static singleton instance;
    static{
        instance=new singleton();
    }
    //创建外部访问的接口

    public static singleton getInstance() {
        return instance;
    }
}
两者的区别，只不过是将实例化的过程放在了静态代码块中
在类转载的时候，就执行静态代码块中的代码，初始化实例

优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。
如果从始至终从未使用过这个实例，则会造成内存的浪费

* */
