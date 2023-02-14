package 多线程.A5生产者与消费者;

import java.util.concurrent.ArrayBlockingQueue;

public class T3_阻塞队列 {
    //只是举例这样的方法，更多的逻辑结构并没有进行补充
    //队列的作用相当于T2案例中的桌子，起到中间桥梁的作用
    public static void main(String[] args) {
        ArrayBlockingQueue<String> a=new ArrayBlockingQueue<>(1);
        cook_Q cook=new cook_Q(a);
        food_Q food=new food_Q(a);
        cook.setName("厨师");
        food.setName("顾客");
        cook.start();
        food.start();
    }
}
class cook_Q extends Thread{
    //公用的队列
    int count=10;
    ArrayBlockingQueue<String> queue;

    public cook_Q(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run(){
        while (true){
            try {
                if (count==0){
                    break;
                }
                queue.put("面条");
                System.out.println("厨师放了一碗面条");
                count--;

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
class food_Q extends Thread{
    ArrayBlockingQueue<String> queue;

    public food_Q(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run(){
        while (true){
            try {
                String take = queue.take();
                System.out.println("顾客拿走："+take);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}