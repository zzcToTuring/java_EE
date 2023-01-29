package 多线程.A6案例;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class T1_抢红包案例 {
    //需求 100元 3个包 5个人抢 用多线程的方式完成
    public static void main(String[] args) {
        T1 t1=new T1();
        T1 t2=new T1();
        T1 t3=new T1();
        T1 t4=new T1();
        T1 t5=new T1();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }




}
class T1 extends Thread{
    //共享的数据
    static BigDecimal money=BigDecimal.valueOf(100);
    static int count=3;
    static final BigDecimal MIN=new BigDecimal("0.01");



    @Override
    public void run(){
        synchronized (T1_抢红包案例.class){
            if (count==0){
                System.out.println(getName()+"没有抢到红包");
            }else {
                //其他的人都中奖了，展示相关的中奖金额
                BigDecimal prize;
                if (count==1){
                    prize=money;
                }else{
                    //获得红包的抽奖范围
                    double bounds=money.subtract(BigDecimal.valueOf(count-1).multiply(MIN)).doubleValue();
                    Random r=new Random();
                    //随机获得的抽奖金额
                    prize=BigDecimal.valueOf(r.nextDouble()*bounds);
                }
                //抽中红包保留小数 四舍五入
                prize=prize.setScale(2, RoundingMode.HALF_UP);
                money=money.subtract(prize);
                count--;
                System.out.println(getName()+"抽中了"+prize+"元");
            }
        }
    }
}