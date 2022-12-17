package 行为型模式.责任链模式.请假案例;
//抽象处理者
public abstract class Hander {
    //定义请假的天数 有1,3,7天，不能更改
    protected final static int NUM_ONE=1;
    protected final static int NUM_THREE=3;
    protected final static int NUM_SEVEN=7;

    //声明请假的天数
    private int day;
    //声明后继者（上级领导）
    protected Hander nextHander;
    //构造方法与 get方法的声明
    public Hander(int day) {
        this.day = day;
    }

    public void setNextHande(Hander nextHander) {
        this.nextHander = nextHander;
    }
    //不同的领导有着不同的请假方法
    protected abstract void handLeave(leaveRequest leave);
    //提交请假条
    public final void summit(leaveRequest leaveRequest){
        this.handLeave(leaveRequest);
        if (this.nextHander !=null && leaveRequest.getNum()>this.day){
            //在有下级的情况下且天数超过自己可允许的范围，交给自己的下级去处理
            this.nextHander.summit(leaveRequest);
        }
        else {
            System.out.println("流程结束");
        }
    }
}
