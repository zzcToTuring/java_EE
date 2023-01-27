package 多线程.A2线程的实现方式;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class T3_callable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建myColl对象（表示多线程要执行的任务）
        MyColl m=new MyColl();
        //创建futureTask对象（作用管理多线程运行结果）
        FutureTask<Integer> fu=new FutureTask<>(m);
        //创建线程
        Thread t1=new Thread(fu);
        t1.setName("t1");
        t1.start();
        Integer integer = fu.get();
        System.out.println(integer);
    }

}

class MyColl implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 0; i < 100; i++) {
            sum=sum+i;
        }
        System.out.println(Thread.currentThread().getName()+"sum");
        return sum;
    }
}