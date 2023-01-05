package IO流.B字符流;

import java.io.FileWriter;
import java.io.IOException;

public class a3字节输出流 {
    public static void main(String[] args) throws IOException {
        /**
         *  第一步：创建对象
         *                 public FileWriter(File file)                            创建字符输出流关联本地文件
         *                 public FileWriter(String pathname)                      创建字符输出流关联本地文件
         *                 public FileWriter(File file,  boolean append)           创建字符输出流关联本地文件，续写
         *                 public FileWriter(String pathname,  boolean append)     创建字符输出流关联本地文件，续写
         *
         *             第二步：读取数据
         *                 void write(int c)                           写出一个字符
         *                 void write(String str)                      写出一个字符串
         *                 void write(String str, int off, int len)    写出一个字符串的一部分
         *                 void write(char[] c)                     写出一个字符数组
         *                 void write(char[] c, int off, int len)   写出字符数组的一部分
         *
         *             第三步：释放资源
         *                 public void close()                 释放资源/关流
         */
        FileWriter fw=new FileWriter("java入门/IO流/temp/write.txt");
        //写一个字符
        fw.write(25105);
        fw.write("\r\n");
        //写多个字符
        fw.write("测试一下写多个字符\r\n");
        fw.write(new char[]{'使','用','c','h','a','r'});
        fw.close();
    }
}
