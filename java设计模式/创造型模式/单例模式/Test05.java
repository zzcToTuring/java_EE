package 创造型模式.单例模式;
//使用枚举的方式，也能实现单例模式
public class Test05 {
    public static void main(String[] args) {
        Singleton05 test1=Singleton05.instance;
        Singleton05 test2=Singleton05.instance;
        System.out.println(test1==test2);
        test1.ok();

    }
}
enum Singleton05{
    instance;//只能存在一个
    public void ok(){
        System.out.println("enum ok!!!");
    }
}
