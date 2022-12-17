package 结构型模式.装饰器模式.快餐店案例;

public class bacon extends garnish{
    public bacon(fastfood fastfood) {
        super(fastfood, "培根",4);
    }

    @Override
    public float cost() {
        return getPrice()+getFastfood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc()+" + "+getFastfood().getDesc();
    }
}
/*
 public egg(fastfood fastfood) {
        super(fastfood,"鸡蛋",2);
    }
    //鸡蛋的价格加上快餐的价格
    @Override
    public float cost() {
        return getPrice()+getFastfood().cost();
    }
 */
