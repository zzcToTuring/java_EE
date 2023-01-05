package IO流.C缓冲流;

import java.io.*;

public class a3字符缓冲流 {
    public static void main(String[] args) throws IOException {
        /**
         * 字符缓冲流--->并不能较快的提高读写速度--->但是他有几个特有的方法，能帮助我们在开发的过程中快速解决问题
         * 字符输入流的构造方法
         *      public BufferedReader(Reader r)
         * 特有方法
         *      public String readLine()   读一整行
         * 字符输出流的构造方法
         *      public BufferedWriter(Writer r)
         * 特有方法
         *      public void newLine()      跨平台的换行
         *
         */
        BufferedReader b1=new BufferedReader(new FileReader(new File("java入门/IO流/temp/Chinese.txt")));
        BufferedWriter b2=new BufferedWriter(new FileWriter(new File("java入门/IO流/temp/temp.txt")));
        //读取一整行
        //System.out.println(b1.readLine());
        //全部读取
        String b;
        while ((b=b1.readLine())!=null){
            System.out.println(b);
        }
        b1.close();
        //字符输出流的独有方法--->可以在不同的平台 都达到换行的目的
        b2.write("写入字符");
        b2.write("\r\n");
        b2.newLine();
        b2.write("再次写入字符");
        b2.close();
    }
}
