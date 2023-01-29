package 多线程.A5生产者与消费者;

public class T2_常规方法 {
    public static void main(String[] args) {
        //使用常规的方法模拟生产者消费者模式
        Food food=new Food();
        Cook cook=new Cook();
        food.setName("顾客");
        cook.setName("厨师");
        food.start();
        cook.start();

    }
}
class Desk{
    //作用：控制生产者和消费者的执行

    //是否有面条 0没有 1有
    public static int foodFlog=0;

    //顾客还能吃下的总个数
    public static int count=10;

    //锁对象
    public static Object lock=new Object();
}

class Food extends Thread{
    @Override
    public void run(){
        while (true){
            synchronized (Desk.lock){
                if (Desk.count==0){
                    break;
                }
                else{
                    //判断桌子上有没有面条
                    if (Desk.foodFlog==0){
                        //没有面条 等待厨师做--->进行等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    else {
                        //存在面条 可以开始吃了
                        Desk.count--;
                        System.out.println("顾客正在吃面条，还能吃"+Desk.count+"碗！！");
                        //吃完唤醒厨师继续做
                        Desk.lock.notifyAll();
                        //修改桌子的状态
                        Desk.foodFlog=0;
                    }
                }
            }
        }
    }

}

class Cook extends Thread{
    @Override
    public void run(){
        while (true){
            synchronized (Desk.lock){
                if (Desk.count==0){
                    break;
                }
                else{
                    //判断桌子上有没有食物
                    if (Desk.foodFlog==1){
                        //有食物 厨师等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        //没有食物，可以去制作食物
                        System.out.println("厨师制作面条");
                        Desk.foodFlog=1;
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}