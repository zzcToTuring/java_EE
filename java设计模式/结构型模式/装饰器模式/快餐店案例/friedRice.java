package 结构型模式.装饰器模式.快餐店案例;
//炒饭
public class friedRice  extends fastfood{
    //给父类中的东西定义
    public friedRice(){
        this.desc="炒饭";
        this.price=10;
    }
    @Override
    public float cost() {
        return super.getPrice();
    }
}
