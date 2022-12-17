package 行为型模式.状态模式.电梯案例;
//抽象状态类
public abstract class liftState {
    //环境角色类对象
    protected context context;
    //设置环境角色类对象的方法
    public void setContext(context context) {
        this.context = context;
    }
    //定义抽象方法
    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();

}
