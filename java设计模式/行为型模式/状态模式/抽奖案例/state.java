package 行为型模式.状态模式.抽奖案例;

public abstract class state {
    abstract void deduceMoney();//扣除积分，开始抽奖
    abstract boolean raffle();//查是否抽中奖品
    abstract void dispensePrize();//发放奖品
}
