package 多线程.A3线程常用方法;

public class T1_name_current_sleep {
    /**
     * String getName() 返回此线程的名称
     * void setName(String name) 设置线程的名字（构造方法中也可设置名字）
     * 细节
     *      --->如果没有设置名字，线程是有默认的名字的Thread-X（X表示序号，从0开始）
     * static Thread currentThread() 获取当前线程的对象
     * 细节
     *      ---->当JVM虚拟机启动后，会自动的启动多条线程，其中一条线程叫main线程
     *      ---->他的作用是调用main方法，并执行里面的代码，在之前，我们所写的代码，都是运行在main线程中
     * static void sleep(long time) 让线程休眠
     * 细节
     *      ---->哪个线程执行到这个方法，那么会停留相对应的时间，到了时间之后会自动醒来
     */
    public static void main(String[] args) throws InterruptedException {
        MyThread t1=new MyThread("T1");
        MyThread t2=new MyThread("T2");
        t1.start();
        t2.start();

        //获取当前线程名字 main线程
        System.out.println(Thread.currentThread().getName());
        //让main线程休眠2秒
        System.out.println(11111);
        Thread.sleep(2000);
        System.out.println(22222);
    }
}
class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"  "+i);
        }
    }
}
