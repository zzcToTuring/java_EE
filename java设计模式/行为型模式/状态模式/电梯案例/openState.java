package 行为型模式.状态模式.电梯案例;

public class openState  extends liftState{
    //在电梯开启状态下，进行这样的操作，根据不同的操作做出不同的反应
    @Override
    public void open() {
        System.out.println("电梯开启。。。");
    }

    @Override
    public void close() {
        //System.out.println("电梯关闭。。。");
        super.context.setLiftState(context.closestate);//修改此时电梯的状态,修改为关闭状态
        super.context.close();

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
