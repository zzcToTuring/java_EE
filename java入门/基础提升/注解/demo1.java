//展示一些javaSE中的注解
package 基础提升.注解;

//压制警告 让idea不会报警(比如方法未使用，字符串可能拼写错误之类)
//@SuppressWarnings("all")
public class demo1 {
    @Deprecated
    public static String t(){
        return "过时方法";
    }

    public static void main(String[] args) {
        String t = demo1.t();
    }
}
