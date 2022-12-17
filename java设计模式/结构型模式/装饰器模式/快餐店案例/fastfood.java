package 结构型模式.装饰器模式.快餐店案例;
//抽象构建角色
public  abstract class fastfood {
    String desc;
    float price;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public fastfood(String desc, float price) {
        this.desc = desc;
        this.price = price;
    }

    public fastfood() {
    }
    //定义计算价格的方法
    public abstract float cost();
}
