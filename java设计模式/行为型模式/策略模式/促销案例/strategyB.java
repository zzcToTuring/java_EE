package 行为型模式.策略模式.促销案例;

public class strategyB implements strategy{
    @Override
    public void show() {
        System.out.println("促销活动B，满200减90");
    }
}
