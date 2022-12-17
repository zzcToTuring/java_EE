package 结构型模式.装饰器模式.快餐店案例;

public class friednoodle extends fastfood{
    public friednoodle() {
        this.desc="炒面";
        this.price=12;
    }

    @Override
    public float cost() {
        return this.getPrice();
    }
}
