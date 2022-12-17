package 行为型模式.模板方法模式.炒菜案例;
//定义蔬菜A类
public class fryvegetableA extends abstractclass{
    @Override
    public void pourvegetable() {
        System.out.println("蔬菜A，放入锅中");
    }

    @Override
    public void poursauce() {
        System.out.println("放入蔬菜A的调料");
    }
}
