package 创造型模式.单例模式;

public class test {
    public static void main(String[] args) {
//        A test1=A.getInstance();
//        A test2=A.getInstance();
//        System.out.println(test1==test2);
    }
}
//review 创建内部类的方式
class A{
    private A(){}//防止外面直接new
    private static volatile A instance;
    private static class Aget{
        private static final A INSTANCE=new A();
    }//创建内部类
    //创建外部接口
    public static A getInstance(){
        return Aget.INSTANCE;
    }

}
//review 双重验证方式
class B{
    private B(){}
    private static volatile B insatnce;
    public static synchronized B getInstance(){
        if (insatnce==null){
            synchronized (B.class){
                if (insatnce==null)
                    insatnce=new B();
            }
        }
        return insatnce;
    }

}