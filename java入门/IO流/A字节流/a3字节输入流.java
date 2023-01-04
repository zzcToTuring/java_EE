package IO流.A字节流;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class a3字节输入流 {
    public static void main(String[] args) throws IOException {
        /**
         * 与输出流相似，也大概分为三步
         * 1、创建对象
         *      如果文件不存在--->直接报错(因为要从其中读取，要是没有数据的话，程序无意义)
         * 2、读取数据
         *      使用一次f.read()读取一次，对应的是ASCII码上的数字
         *      调用一次f.read()读取一次，同样的，读写指针也会发生相应的移动
         * 3、释放资源
         *      与之前相同，在使用完之后需要释放资源
         */
        FileInputStream f=new FileInputStream(new File("java入门\\IO流\\temp\\c.txt"));
        //读取一个
        System.out.println((char) f.read());
        //循环读写
        int b;//如果不用一个变量接住，那么再次调用read的时候，指针又会移动一次了
        while ((b=f.read())!=-1){
            System.out.print((char) b);
        }
        f.close();
    }
}
