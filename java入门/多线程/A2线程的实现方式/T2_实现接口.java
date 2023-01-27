package 多线程.A2线程的实现方式;

public class T2_实现接口 {
    public static void main(String[] args) {
        MyRun mt=new MyRun();
        //创建线程对象
        Thread t1=new Thread(mt);
        Thread t2=new Thread(mt);
        Thread t3=new Thread(mt);
        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");
        t1.start();
        t2.start();
        t3.start();
    }
}

class MyRun implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"hello world");
        }
    }
}
