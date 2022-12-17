package 行为型模式.状态模式.电梯案例;

public class closeState extends liftState{
    @Override
    public void open() {
        super.context.setLiftState(context.openstate);
        super.context.open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭");
    }

    @Override
    public void run() {
        super.context.setLiftState(context.runstate);
        super.context.run();
    }

    @Override
    public void stop() {
        super.context.setLiftState(context.stopstate);
        super.context.stop();
    }
}
