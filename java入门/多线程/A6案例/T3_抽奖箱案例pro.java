package 多线程.A6案例;

import java.util.ArrayList;
import java.util.Collections;

public class T3_抽奖箱案例pro {
    //在T2案例中额外添加：多个抽奖箱，并且在抽奖完成之后展示每个抽奖箱所抽取的结果
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,100,200,300,10,5,20,30,40,50,90,80);
        T3 t1=new T3(list);
        T3 t2=new T3(list);
        T3 t3=new T3(list);
        t1.start();
        t2.start();
        t3.start();
    }
}
class T3 extends Thread{
    ArrayList<Integer> list;

    public T3(ArrayList<Integer> list) {
        this.list = list;
    }
    @Override
    public void run(){
        ArrayList<Integer> boxList=new ArrayList<>();
        while (true){
            synchronized (T3_抽奖箱案例pro.class){
                //结束
                if (list.size()==0){
                    System.out.println(getName()+boxList);
                    break;
                }
                //未结束
                else {
                    Collections.shuffle(list);
                    int temp=list.remove(0);
                    boxList.add(temp);
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
