package IO流.A字节流;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class a2换行与多字符输出 {
    public static void main(String[] args) throws IOException {
        /**
         *  换行再次写出一个换行符就可以了
         *      windows： \r\n   Linux:    \n    Mac:      \r
         *  细节：
         *      在windows操作系统当中，java对回车换行进行了优化。虽然完整的是\r\n，但是我们写其中一个\r或者\n，java也可以实现换行，因为java在底层会补全。
         *
         *   一次写多个数据：
         *     void write(int b)                       一次写一个字节数据
         *     void write(byte[] b)                    一次写一个字节数组数据
         *     void write(byte[] b, int off, int len)  一次写一个字节数组的部分数据（数组，起始索引，个数）
         */
        FileOutputStream fileOutputStream=new FileOutputStream(new File("java入门\\IO流\\temp\\b.txt"));
        //数组的形式，这样能传输多个
        byte[] bytes="this is a test of input".getBytes(StandardCharsets.UTF_8);
        fileOutputStream.write(bytes);
        //换行
        fileOutputStream.write("\r".getBytes(StandardCharsets.UTF_8));
        //指定数组的部分数据
        fileOutputStream.write("test".getBytes(),0,2);
        fileOutputStream.close();
    }
}
