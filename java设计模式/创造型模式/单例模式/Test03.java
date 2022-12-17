package 创造型模式.单例模式;
//懒汉式的优化
//懒汉式有线程不安全，加锁会导致效率过慢
//使用双重检测技术，保证线程的安全
public class Test03 {
    public static void main(String[] args) {
        Singleton03 test1=Singleton03.getInstance();
        Singleton03 test2=Singleton03.getInstance();
        System.out.println(test1==test2);
    }
}
class Singleton03{
    //volatile相当于一个安全检测的装置
    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
    //同时保证了效率
    private static volatile Singleton03 instance;
    private Singleton03(){};
    public static synchronized Singleton03 getInstance(){
        //双重检查
        if (instance==null){
            synchronized (Singleton03.class){
                if (instance==null){
                    instance=new Singleton03();
                }
            }

        }
        return instance;
    }
}