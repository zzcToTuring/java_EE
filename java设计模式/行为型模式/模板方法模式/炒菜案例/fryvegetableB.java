package 行为型模式.模板方法模式.炒菜案例;

public class fryvegetableB extends abstractclass{
    @Override
    public void pourvegetable() {
        System.out.println("放入蔬菜B，开始炒");
    }

    @Override
    public void poursauce() {
        System.out.println("放入蔬菜B的专属调料");
    }
}
