package 行为型模式.状态模式.抽奖案例;
//发放奖品的界面
public class dispensestate extends state{
    active active;

    public dispensestate(active active) {
        this.active = active;
    }

    @Override
    void deduceMoney() {
        System.out.println("已经中奖了，先去领取奖品吧");
    }

    @Override
    boolean raffle() {
        System.out.println("已经中奖了，先去领取奖品吧");
        return false;
    }

    @Override
    void dispensePrize() {
        if (active.getCount()>0){
            System.out.println("恭喜，请拿好你的奖品");
            active.setState(active.getNostate());//初始状态
        }
        else {
            System.out.println("虽然你中奖了，但是来晚了没有奖品了，抱歉");
            System.out.println("一切解释权归商家所有");
            active.setState(active.getNostate());//返回不能抽奖的状态
            System.exit(0);//退出抽奖程序
        }
    }
}
