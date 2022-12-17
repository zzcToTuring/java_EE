package 创造型模式.工厂模式;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//1) 披萨的种类很多(比如 GreekPizz、CheesePizz 等)
//2) 披萨的制作有 prepare，bake, cut, box
//3) 完成披萨店订购功能
public class pizzaStore {
    public static void main(String[] args) {
       new orderpizza();//创建实例对象
    }
}
//构建抽象类，所有的pizza都要满足以下的方法
abstract class pizza{
    protected String name;
    public abstract void prepare();
    public void bake(){
        System.out.println(name+" baking ");
    }
    public void cut(){
        System.out.println(name+" cutting ");
    }
    public void box(){
        System.out.println(name+" boxing ");
    }
    public void setName(String name) {
        this.name = name;
    }
}
//A类pizza的构建
class Apizza extends pizza{
    @Override
    public void prepare() {
        System.out.println("A种类的pizza准备ing");
    }
}
//B类pizza的构建
class Bpizza extends pizza{
    @Override
    public void prepare() {
        System.out.println("B种类的pizza准备ing");
    }
}
//点餐的类
class orderpizza{
    //创建构造方法
    orderpizza(){
        //首先 创建pizza的对象
        pizza pizza=null;
        do{
            String orderType=getType();
            if (orderType.equals("A")){
                pizza=new Apizza();
                pizza.setName("A");
                break;
            }else if (orderType.equals("B")){
                pizza=new Bpizza();
                pizza.setName("B");
                break;
            }
            else {
                System.out.println("不存在，结束进程......");
                break;
            }
        }
        while(true);
        if(pizza !=null){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }

    }
    //从中读取用户输入的数据,BufferedReader方法
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
