package 集合.泛型;
//泛型不具有继承性，但是数据具有继承性
import java.util.ArrayList;
public class a2数据的继承性 {
    public static void main(String[] args) {
        //创建集合的对象
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();

        //调用method方法
        method(list1);
        method(list2);
        method(list3);

    }
    //泛型规定的是什么类型 那么他只能传递什么类型
    //如果我现在并不知道他是什么类型的话，我只知道他继承于E或者其他类继承于他，可以写成?extends 或 ?super的方式
    public static void method(ArrayList<?extends Ye> list) {

    }
}
class Ye{}
class Fu extends Ye{}
class Zi extends Fu{}