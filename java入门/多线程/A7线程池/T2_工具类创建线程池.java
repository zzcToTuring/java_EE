package 多线程.A7线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class T2_工具类创建线程池 {
    /**
     * Executors:线程池的工具类通过调用方法返回值不同类型的线程池对象
     * 方法：
     *  public static ExecutorService newCachedThreadPool() 创建一个没有上限的线程池
     *  public static ExecutorService newFixedThreadPool(int nThreads) 创建有上限的线程池
     */
    public static void main(String[] args) {
        //获取线程池对象
        ExecutorService executorService = Executors.newCachedThreadPool();
        //提交任务
        T2 t=new T2();
        executorService.submit(t);
        executorService.submit(t);
        executorService.submit(t);
        executorService.submit(t);
        //摧毁线程池
        executorService.shutdown();
    }
}

class T2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}