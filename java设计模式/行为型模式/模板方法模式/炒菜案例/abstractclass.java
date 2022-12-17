package 行为型模式.模板方法模式.炒菜案例;
//定义炒菜的抽象类，定义模板方法
public abstract class abstractclass {
    //模板方法定义
    //定义为最终，不能修改，必须按照这个方式炒菜
    public final void cookprocess(){
        pullOil();
        poursauce();
        pourvegetable();
        fry();

    }
    //开始先进行倒油和热油的操作
    public void  pullOil(){
        System.out.println("倒油");
    }
    public void heatOil(){
        System.out.println("热油");
    }
    //定义后面的方法
    public abstract void pourvegetable();//倒蔬菜
    public abstract void poursauce();//倒调料
    public void fry(){
        System.out.println("炒菜ing....");
    }

}
