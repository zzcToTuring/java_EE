package 多线程.A6案例;

import java.util.ArrayList;
import java.util.Collections;

public class T2_抽奖箱案例 {
    //集合里面有一堆奖项 两个抽奖箱进行抽奖 使用多线程完成
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,100,200,300,10,5);
        T2 t1=new T2(list);
        T2 t2=new T2(list);
        t1.start();
        t2.start();
    }
}
class T2 extends Thread{
    ArrayList<Integer> list;

    public T2(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run(){
        while (true){
            synchronized (T2_抽奖箱案例.class){
                if (list.size()==0){
                    break;
                }else {
                    Collections.shuffle(list);
                    int prize=list.remove(0);
                    System.out.println(getName()+"产生了一个"+prize+"元大奖");
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
