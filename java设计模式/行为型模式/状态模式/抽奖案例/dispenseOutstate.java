package 行为型模式.状态模式.抽奖案例;
//没有奖品的状态
public class dispenseOutstate extends state{
    active active;

    public dispenseOutstate(active active) {
        this.active = active;
    }

    @Override
    void deduceMoney() {
        System.out.println("不能扣除积分，我们奖品都没有了");
    }

    @Override
    boolean raffle() {
        System.out.println("不能抽奖，抽到也没用，我们都没有奖品了");
        return false;
    }

    @Override
    void dispensePrize() {
        System.out.println("都说了没有奖品还兑奖干嘛？");
    }
}
