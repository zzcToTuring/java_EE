package IO流.A字节流;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class a4一次读取多个数据 {
    public static void main(String[] args)throws IOException {
        /**
         * public int read(byte[] buffer) 一次读一个字节数组数据 返回的值为本次读取的数据
         */

        FileInputStream f=new FileInputStream(new File("java入门\\IO流\\temp\\c.txt"));
        //以前只能一次读一个，现在能一次读3个
        byte[] bytes=new byte[3];
        //本次读到的数据
        int len=f.read(bytes);
        //读到的char放在数组中
        System.out.println(Arrays.toString(bytes));
        //把他转化为字符串看看--->为什么要加长度--->因为如果他没有读取到，之前数组的内容不会被覆盖的，会导致重复读
        System.out.println(new String(bytes,0,len));
        f.close();
        System.out.println("-------------------------------------");
        //完整的来全部读取一次吧
        FileInputStream f1=new FileInputStream(new File("java入门\\IO流\\temp\\c.txt"));
        byte[] b=new byte[4];
        int temp;
        while ((temp=f1.read(b))!=-1){
            System.out.print(new String(b,0,temp));
        }
        f1.close();
//        System.out.println(new String(new char[]{97,98,99,100}));
    }
}
