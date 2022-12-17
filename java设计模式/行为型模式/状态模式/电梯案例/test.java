package 行为型模式.状态模式.电梯案例;

public class test {
    public static void main(String[] args) {
        context context=new context();
        context.setLiftState(new stopState());
        context.open();
        context.run();
    }
}
