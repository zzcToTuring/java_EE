package 多线程.A3线程常用方法;

public class T4_出让线程 {
    /**
     * public static void yield() 出让线程/礼让线程
     */
    public static void main(String[] args) {
        c t1=new c();
        c t2=new c();
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }

}

class c extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"   "+i);
            //让出CPU的线程，重新争夺资源，这样可以分配的更加均匀一点
            Thread.yield();
        }
    }
}