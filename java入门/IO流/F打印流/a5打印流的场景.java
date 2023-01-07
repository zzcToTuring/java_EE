package IO流.F打印流;

import java.io.PrintStream;

public class a5打印流的场景 {
    public static void main(String[] args) {
        //标准输出流，所用到就是标准输出流
        //获取打印流的对象，此打印流在虚拟机启动的时候，由虚拟机创建，默认指向控制台
        //特殊的打印流，系统中的标准输出流,是不能关闭，在系统中是唯一的。
        PrintStream ps=System.out;
        ps.println("123");
        //但注意不能关闭流 关闭流之后就不能进行标准输出流操作
        ps.close();
        System.out.println("123");
    }
}
