package 多线程.A4线程安全;

public class T4_死锁 {
    //死锁是我们需要避免的一种情况，它会导致程序一直占用，避免死锁的方式就是尽量不要对锁进行嵌套
    public static void main(String[] args) {
        test t1=new test();
        test t2=new test();
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }

}
class test extends Thread{
    static Object object1=new Object();
    static Object object2=new Object();

    @Override
    public void run(){
        while (true){
            if ("t1".equals(getName()))
            {
                synchronized (object1){
                    System.out.println("线程t1拿到A锁，准备拿B锁");
                    synchronized (object2){
                        System.out.println("线程t1拿到B锁，顺利完成一轮");
                    }
                }
            }else if("t2".equals(getName())){
                if ("t2".equals(getName())){
                    synchronized (object2){
                        System.out.println("线程t2拿到了B锁，准备拿A锁");
                        synchronized (object1){
                            System.out.println("线程t2拿到A锁，顺利完成一轮");
                        }
                    }
                }
            }
        }
    }
}
