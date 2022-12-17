package 行为型模式.策略模式.促销案例;
//环境类，这里指的是促销员
public class salesman {
    //聚合策略类
    private strategy man;

    public salesman(strategy man) {
        this.man = man;
    }
    //由环境类人所展示
    public void salesmanshow(){
        man.show();
    }

    public void setMan(strategy man) {
        this.man = man;
    }

    public strategy getMan() {
        return man;
    }
}
