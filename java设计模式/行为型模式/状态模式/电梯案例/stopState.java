package 行为型模式.状态模式.电梯案例;

public class stopState  extends liftState{
    @Override
    public void open() {
        super.context.setLiftState(context.openstate);
        super.context.open();
    }

    @Override
    public void close() {
        super.context.setLiftState(context.closestate);
        super.context.close();
    }

    @Override
    public void run() {
        super.context.setLiftState(context.runstate);
        super.context.run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止");
    }
}
