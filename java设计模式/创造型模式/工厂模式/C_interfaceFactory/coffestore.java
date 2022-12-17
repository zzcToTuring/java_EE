package 创造型模式.工厂模式.C_interfaceFactory;


//咖啡店
public class  coffestore {

   private coffeeFactory factory;
   //设置工厂

   public void setFactory(coffeeFactory factory){
       this.factory=factory;
   }
   //点咖啡功能
    public coffee orderCoffer(){
       coffee coffee=factory.createcoffee();
       coffee.add_milk();
       coffee.add_sugar();
       return coffee;
    }
}
