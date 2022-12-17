package 行为型模式.状态模式.抽奖案例;
//抽奖活动
public class active {
    state state;//初始的状态
    int count;//奖品的数量
    //构造方法
    public active(int count) {
        this.state=getNostate();//开始活动的时候，初始状态位不可抽奖的状态
        this.count=count;//设置奖品的数量
    }
    //创建各种各样的状态对象
    canstate canstate=new canstate(this);
    dispensestate dispensestate=new dispensestate(this);
    dispenseOutstate dispenseOutstate=new dispenseOutstate(this);
    nostate nostate=new nostate(this);
    //扣分
    public void deucectMoney(){
        state.deduceMoney();
    }
    //抽奖
    public void raffle(){
        if (state.raffle()){
            //领取奖品
            state.dispensePrize();
        }
    }
//    public void test(){
//        state.dispensePrize();
//    }

    //生成get和set方法
    //每次查询剩下的数量，说明有人抽中奖励了，此时数量也要减少
    public int getCount() {
        int temp=count;
        count--;
        return temp;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public void setState(state state) {
        this.state = state;
    }
    public state getState() {
        return state;
    }
    public canstate getCanstate() {
        return canstate;
    }

    public void setCanstate(canstate canstate) {
        this.canstate = canstate;
    }

    public dispensestate getDispensestate() {
        return dispensestate;
    }

    public void setDispensestate(dispensestate dispensestate) {
        this.dispensestate = dispensestate;
    }

    public dispenseOutstate getDispenseOutstate() {
        return dispenseOutstate;
    }

    public void setDispenseOutstate(dispenseOutstate dispenseOutstate) {
        this.dispenseOutstate = dispenseOutstate;
    }

    public nostate getNostate() {
        return nostate;
    }

    public void setNostate(nostate nostate) {
        this.nostate = nostate;
    }
}
