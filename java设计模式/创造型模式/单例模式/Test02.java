package 创造型模式.单例模式;

public class Test02 {
    public static void main(String[] args) {
    //Singleton test1=Singleton.getInstance();
    //Singleton test2=Singleton.getInstance();
    //System.out.println(test1.hashCode());
    Singleton02 test1=Singleton02.getInstance();
    Singleton02 test2=Singleton02.getInstance();
    System.out.println(test1==test2);
    }
}
//懒汉式，到用的时候，才去创建
class Singleton02{
private static Singleton02 instance;
private Singleton02(){}
//提供一个静态的共有方法，当使用到该方法的时候，才去创建
//这样的方式称为懒汉式
public  static  Singleton02 getInstance(){
    if(instance == null){
        instance = new Singleton02();
    }
    return instance;
}
}
/*
* 这样的方式是不安全的，仅仅试用于单线程，在多线程中
* 一个线程进入了if (singleton == null)判断语句块，还未来得及
往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。所以
在多线程环境下不可使用这种方式
*
* 解决方式，改为public synchronized static Singleton02 getInstance(){}
* 这样的话线程就安全了，但是也存在缺点，就是每次效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行
同步
* */
