package 多线程.A4线程安全;

public class T1_同步代码块 {
    //情景：一共有100张票，3个售票厅进行卖票的操作
    /**
     * 同步代码块：把操作共享数据的代码锁起来
     * 格式：
     *      synchronized(锁){操作共享数据的代码}
     * 特点：
     *  1、锁默认打开，有一个线程进去了，锁自动关闭
     *  2、里面的代码全部执行完毕，线程出来，锁自动打开
     *  注意点：
     *   1、锁要唯一，不能有多种不同的锁，这样会导致失效
     *   2、需要注意同步代码块中的内容
     */
    public static void main(String[] args) {
        sell1 s1=new sell1();
        sell1 s2=new sell1();
        sell1 s3=new sell1();
        s1.setName("售票点1");
        s2.setName("售票点2");
        s3.setName("售票点3");
        s1.start();
        s1.setPriority(1);
        s2.start();
        s3.start();
    }
}
class sell1 extends Thread{
    //可能会创建多个实例对象，因此要写成静态变量
    static int ticket=0;
    @Override
    public void run(){
        while (true){
            synchronized (sell1.class){
                if (ticket<100){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket++;
                    System.out.println(getName()+"正在售卖"+ticket+"张票！！");
                }
                else {
                    break;
                }
            }

        }
    }
}