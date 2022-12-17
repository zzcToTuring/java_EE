package 行为型模式.状态模式.抽奖案例;

import java.util.Random;
//已经扣除了积分，是可以抽奖的状态了
public class canstate extends state{
    active active;
    public canstate(active active) {
        this.active= active;
    }
    //到达可抽奖的状态，说明已经扣除了积分，因此不能扣除积分
    @Override
    void deduceMoney() {
        System.out.println("已经扣除了积分，快去抽奖吧");
    }
    //处于可以抽奖的状态，正在开始抽奖ing
    @Override
    boolean raffle() {
        System.out.println("正在开始抽奖，请稍等");
        Random r = new Random();
        int num = r.nextInt(10);
        // 10%中奖机会
        if(num == 0){
            active.setState(active.getDispensestate());
            return true;
        }
        else{
            System.out.println("很遗憾没有抽中奖品！");
            // 改变状态为不能抽奖
            active.setState(active.getNostate());
            return false;
        }
    }

    @Override
    void dispensePrize() {
        System.out.println("先去抽奖吧，抽到了再来领奖吧");
    }
}
