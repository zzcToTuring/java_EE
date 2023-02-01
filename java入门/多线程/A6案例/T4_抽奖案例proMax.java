package 多线程.A6案例;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class T4_抽奖案例proMax {
    //在之前抽奖案例的基础上，返回抽奖的最大值
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,100,200,300,10,5,20,30,40,50,90,80);
        T4 t4=new T4(list);
        //创建容器
        FutureTask<Integer> f1=new FutureTask<>(t4);
        FutureTask<Integer> f2=new FutureTask<>(t4);

        Thread t1=new Thread(f1);
        Thread t2=new Thread(f2);

        t1.start();
        t2.start();
        System.out.println(t1.getName()+" max: "+f1.get());
        System.out.println(t2.getName()+" max "+f2.get());
    }
}
class T4 implements Callable<Integer> {
    ArrayList<Integer> list;

    public T4(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public Integer call() throws Exception {
        ArrayList<Integer> boxList=new ArrayList<>();
        while (true){
            synchronized (T4_抽奖案例proMax.class){
                if (list.size()==0){
                    System.out.println(Thread.currentThread().getName()+boxList);
                    break;
                }else {
                    Collections.shuffle(list);
                    boxList.add(list.remove(0));
                }
            }
            Thread.sleep(10);
        }
        if (boxList.size()==0){
            return null;
        }else {
            return Collections.max(boxList);
        }
    }
}
