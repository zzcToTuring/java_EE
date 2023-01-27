package 多线程.A3线程常用方法;

public class T2_线程的优先级 {
    /**
     * setPriority(int newPriority) 设置线程的优先级
     * final int getPriority() 获取线程的优先级
     *
     */
    public static void main(String[] args) {
        MyRun m=new MyRun();
        Thread t1=new Thread(m,"t1");
        Thread t2=new Thread(m,"t2");
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}
class MyRun implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"    "+i);
        }
    }
}