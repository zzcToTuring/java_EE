package 行为型模式.状态模式.电梯案例;
//环境角色类
public class context {
    //定义相应状态对象的常量
    public final static openState openstate=new openState();
    public final static closeState closestate=new closeState();
    public final static runState runstate=new runState();
    public final static stopState stopstate=new stopState();

    //设置一个当前电梯状态变量
    private liftState liftState;

    public liftState getLiftState() {
        return liftState;
    }

    public void setLiftState(liftState liftState) {
        this.liftState = liftState;
        liftState.setContext(this);//设置指定当前状态对象中的context对象
    }
    public void open(){
        liftState.open();
    }
    public void close(){
        liftState.close();
    }
    public void run(){
        liftState.run();
    }
    public void stop(){
        liftState.stop();
    }

}
