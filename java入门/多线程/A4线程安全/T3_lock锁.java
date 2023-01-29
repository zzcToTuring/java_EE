package 多线程.A4线程安全;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class T3_lock锁 {
    /**
     * lock实现提供比使用synchronized方法和语句更加广泛，提供了获得锁与释放锁的方法
     * void lock() 获得锁
     * void unlock() 释放锁
     */
    public static void main(String[] args)  {
        sell3 t1=new sell3("售票点1");
        sell3 t2=new sell3("售票点2");
        sell3 t3=new sell3("售票点3");
        t1.setPriority(5);
        t2.setPriority(1);
        t3.setPriority(10);

        t1.start();
        t2.start();
        t3.start();
    }
}

class sell3 extends Thread {
    //定义总票数与锁的对象
    static int ticket = 0;
    static Lock lock = new ReentrantLock();

    public sell3(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (ticket == 100) {
                    break;
                } else {
                    Thread.sleep(10);
                    ticket++;
                    System.out.println(getName()+"正在售卖"+ticket+"张票！！");
                    Thread.yield();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
