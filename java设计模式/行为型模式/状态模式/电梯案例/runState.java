package 行为型模式.状态模式.电梯案例;

public class runState  extends liftState{
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯正在运行");
    }
    //在运行的时候紧急停止
    @Override
    public void stop() {
    super.context.setLiftState(context.stopstate);
    super.context.stop();
    }
}
