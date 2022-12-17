package 行为型模式.状态模式.抽奖案例;
//不能抽奖的状态，初始状态
public class nostate extends state{
    //引入抽象的相关案例
    private active active;
    //生成构造函数
    public nostate(active active) {
        this.active = active;
    }

    @Override
    void deduceMoney() {
        System.out.println("扣除积分，开始抽奖");
        active.setState(active.getCanstate());//扣除积分，此时的状态为可抽奖状态
    }

    @Override
    boolean raffle() {
        System.out.println("当前没有扣除积分，只有扣除积分才能抽奖");
        return false;
    }

    @Override
    void dispensePrize() {
        System.out.println("都没有扣除积分，别提发放奖品了");
    }
}
