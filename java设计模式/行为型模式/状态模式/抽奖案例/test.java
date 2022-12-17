package 行为型模式.状态模式.抽奖案例;

public class test {
    public static void main(String[] args) {
        active active=new active(1);//创建一个新的活动，里面有三个奖品
        int count=0;
        //创建活动的时候，状态默认为不能抽奖的状态
       active.deucectMoney();
       //active.test();
       active.raffle();


        /* while (true){
            active.deucectMoney();//扣除积分
            active.raffle();
            count++;
            System.out.println(count);
        }
        */

    }
}
