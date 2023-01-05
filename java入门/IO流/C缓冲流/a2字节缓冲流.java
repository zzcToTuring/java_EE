package IO流.C缓冲流;

import java.io.*;

public class a2字节缓冲流 {
    public static void main(String[] args) throws IOException {
        /*
         *   字节缓冲输入流的构造方法：
         *           public BufferedInputStream(InputStream is)
         *
         *    字节缓冲输出流的构造方法：
         *           public BufferedOutputStream(OutputStream os)
         *     作用：
         *          把基本流包装成高级流，提高写出数据的性能
         *
         * */

        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(new File("java入门/IO流/temp/Chinese.txt")));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(new File("java入门/IO流/temp/temp.txt")));

        int b;
        while ((b=bis.read())!=-1){
            bos.write(b);
        }
        bos.close();
        bis.close();

    }
}
