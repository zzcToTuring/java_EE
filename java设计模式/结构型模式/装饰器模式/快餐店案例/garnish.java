package 结构型模式.装饰器模式.快餐店案例;
//装饰者类 抽象装饰者角色
public abstract class garnish extends fastfood{
    private fastfood fastfood;//声明快餐类的对象
    public fastfood getFastfood() {
        return fastfood;
    }

    public void setFastfood(fastfood fastfood) {
        this.fastfood = fastfood;
    }

    public garnish(fastfood fastfood,String desc, float price) {
        super(desc, price);
        this.fastfood = fastfood;
    }
}
