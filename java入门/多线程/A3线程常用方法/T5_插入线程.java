package 多线程.A3线程常用方法;

public class T5_插入线程 {
    /**
     * public final void join() 插入线程/插队线程
     */
    public static void main(String[] args) throws InterruptedException {
        D d=new D();
        d.setName("线程1");
        d.start();
        //插入线程---->把d这个线程，插入到当前线程之前（main）
        d.join();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"  "+i);
        }
    }
}
class D extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"   "+i);
        }
    }
}
