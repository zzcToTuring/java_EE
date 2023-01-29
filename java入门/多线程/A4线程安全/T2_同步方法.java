package 多线程.A4线程安全;

public class T2_同步方法 {
    /**
     * 同步方法：
     *      1、格式--->修饰符 synchronized 返回值类型 方法名(参数){}
     *      2、特点：
     *          1、同步方法锁住的是方法里面所有的代码
     *          2、锁对象不用(能)自己指定 静态：当前类的字节码文件对象 非静态:this
     */
    public static void main(String[] args) {
        sell2 s=new sell2();
        Thread t1=new Thread(s,"售票点1");
        Thread t2=new Thread(s,"售票点2");
        Thread t3=new Thread(s,"售票点3");
        t1.setPriority(1);
        t1.start();
        t2.start();
        t3.start();
    }
}
class sell2 implements Runnable{
    //接口只会实现一次，因此不用写成静态
    int ticket=0;
    @Override
    public void run() {
        while (true){
            if (method()) break;
        }
    }
    private synchronized boolean method(){
        if (ticket ==100){
            return true;
        }else {
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            ticket++;
            System.out.println(Thread.currentThread().getName()+"正在售卖"+ticket+"张票！！");
        }
        return false;
    }
}
