package 多线程.A3线程常用方法;

public class T3_守护线程 {
    /**
     * final void setDaemon(boolean on) 设置线程为守护线程
     * 定义：
     *      当其他非守护线程执行完毕之后，守护线程会陆续结束
     * 通俗易懂的定义：
     *      守护线程为备胎，当其他的线程结束之后，备胎没有存在的必要会逐渐结束
     */
    public static void main(String[] args) {
        A t1=new A();
        B t2=new B();
        t1.setName("舔狗线程");
        t2.setName("线程");
        //在线程结束之后，舔狗线程也会逐渐结束
        //场景：大线程结束后，小线程也没有存在的必要了
        t1.setDaemon(true);
        t1.start();
        t2.start();
    }
}
class A extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"   "+i);
        }
    }
}
class B extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"  "+i);
        }
    }
}