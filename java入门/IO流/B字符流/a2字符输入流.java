package IO流.B字符流;

import java.io.FileReader;
import java.io.IOException;

public class a2字符输入流 {
    public static void main(String[] args)throws IOException {
          /*
            第一步：创建对象
            public FileReader(File file)        创建字符输入流关联本地文件
            public FileReader(String pathname)  创建字符输入流关联本地文件

            第二步：读取数据
            public int read()                   读取数据，读到末尾返回-1
            public int read(char[] buffer)      读取多个数据，读到末尾返回-1

            第三步：释放资源
            public void close()                 释放资源/关流
        */

        FileReader f=new FileReader("java入门/IO流/temp/Chinese.txt");
        int b;
        //1.read():默认也是一个字节一个字节的读取的,如果遇到中文就会一次读取多个
        //2.在读取之后，方法的底层还会进行解码并转成十进制，最终把这个十进制作为返回值
        //  这个十进制的数据也表示在字符集上的数字
        //  英文：文件里面二进制数据 0110 0001
        //          read方法进行读取，解码并转成十进制97
        //  中文：文件里面的二进制数据 11100110 10110001 10001001
        //          read方法进行读取，解码并转成十进制27721
        while ((b=f.read())!=-1){
            // 我想看到中文汉字，就是把这些十进制数据，再进行强转就可以了
            System.out.print((char)b);
        }
        f.close();

        //一次读取多个
        System.out.println("===================");
        FileReader f2=new FileReader("java入门/IO流/temp/Chinese.txt");
        char[] chars=new char[4];
        int len;
        //read(chars)：读取数据，解码，强转三步合并了，把强转之后的字符放到数组当中-->空参的read + 强转类型转换
        while ((len=f2.read(chars))!=-1){
            System.out.print(new String(chars,0,len));
        }
        f2.close();
    }
}
