package IO流.D转化流;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class a1转化流概述 {
    public static void main(String[] args) throws IOException {
        /**
         * 转化流概述：是字符流与字节流之间的桥梁
         * 作用：
         *  1、指定字符集读写（在jdk11版本中已经淘汰了）
         *  2、字节流想要使用字符流的相关方法
         * 方法：
         *  1、字符转化输入流：InputStreamReader
         *  2、字符转化输出流：OutPutStreamWriter
         * TIP:
         *  只有字节转化为字符，反过来是没有的
         */
        //实例1 读取gbk格式文档--->在reader函数中，构造函数的第二个参数指定字符集
        FileReader f=new FileReader(new File("java入门/IO流/temp/gbk格式文档.txt"), Charset.forName("GBK"));
        System.out.println((char) f.read());

        /**
         * 同理 输出 输入流也能使用这样的方式指定编码格式
         */
    }
}
