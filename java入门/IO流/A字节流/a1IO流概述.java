package IO流.A字节流;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class a1IO流概述 {
    public static void main(String[] args) throws IOException {
        /**
         * 什么是io流：
         *      存储和读取数据的解决方案
         *      I：input O：output
         * IO流的作用：
         *      用于读写数据(本地文件，网络)
         *  IO流的分类：
         *      输出流：程序--->文件
         *      输入流:文件--->程序
         * IO文件操作的分类：
         *      字节流：能操作所有类型的文件
         *      字符流：只能操作纯文本文件
         * 什么是纯文本文件
         *      用windows自带的记事本打开并且能读懂的文件
         *
         */
        /**
         * 字节输出流的细节：
         * 1、创建字节输出流对象
         *      1、参数是字符串表示的路径或者是file对象都是可以的(不是file底层也会调用File方法)
         *      2、如果文件不存在会创建一个新的文件，但要保证父级路径是存在的
         *      3、如果文件已经存在，会清空(要想不清空 需要在后面加参数true)
         * 2、写数据
         *      f.write方法参数是整数，但实际上写到本地文件中的整数是ASCII码表上对应的字符
         * 3、释放资源
         *      使用完IO流之后要释放资源，不然文件表示一直被占用
         */
        FileOutputStream fileOutputStream=new FileOutputStream(new File("java入门\\IO流\\temp\\a.txt"),true);
        fileOutputStream.write(97);
        fileOutputStream.write(98);
        fileOutputStream.close();
    }
}
