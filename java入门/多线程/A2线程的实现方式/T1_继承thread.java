package 多线程.A2线程的实现方式;

public class T1_继承thread {
    /**
     * 第一种定义方式：
     * 1、自己定义一个类继承thread
     * 2、重写run方法
     * 3、创建子类的对象，并启动线程
     */
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();

        t1.setName(" T1 ");
        t2.setName(" T2 ");
        t3.setName(" T3 ");

        t1.start();
        t2.start();
        t3.start();
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=0;i<20;i++){
            System.out.println(this.getName()+" hello world  ");
        }
    }
}