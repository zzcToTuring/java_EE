package 行为型模式.策略模式.促销案例;

public class strategyA implements strategy{
    @Override
    public void show() {
        System.out.println("促销活动A，买一送一");
    }
}
