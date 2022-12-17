package 结构型模式.装饰器模式.快餐店案例;

public class test {
    public static void main(String[] args) {
        //点一份炒粉
        fastfood food=new friedRice();
        System.out.println(food.cost()+" : "+food.getDesc());
        //在炒饭里面加鸡蛋
        food=new egg(food);
        System.out.println(food.cost()+"  :  "+food.getDesc());
        //在上面的情况下在加入一个鸡蛋
        food=new egg(food);
        System.out.println(food.cost()+"  :  "+food.getDesc());
        //在加上一个培根
        food=new bacon(food);
        System.out.println(food.cost()+"  :  "+food.getDesc());

    }
}
