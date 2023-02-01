package 多线程.A7线程池;

import java.util.concurrent.*;

public class T3_自定义定义线程 {
    public static void main(String[] args) {
        //与T2使用工具类相比，T3的区别是自己创建，因此一些参数能直接指定
        ThreadPoolExecutor pool=new ThreadPoolExecutor(
                3,//核心线程数量
                6,//最大的线程数 核心线程+临时线程=最大线程
                60,//空闲线程最大存活时间
                TimeUnit.SECONDS,//时间的单位
                new ArrayBlockingQueue<>(3),//任务队列（等待）
                Executors.defaultThreadFactory(),//创建线程工程
                new ThreadPoolExecutor.AbortPolicy()//任务的拒绝策略
        );

        T3 t=new T3();
        pool.submit(t);
        pool.submit(t);
        pool.submit(t);
        pool.submit(t);
        pool.submit(t);
        pool.submit(t);
        pool.submit(t);
        pool.submit(t);
        pool.submit(t);

    }
}
class T3 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}