package IO流.B字符流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class a4文件加密练习 {
    public static void main(String[] args) throws IOException {
        //前置知识---> a^(异或)b=c c^b=a 可利用此条原理对文件的字节进行加密操作
        FileInputStream fi=new FileInputStream("java入门/IO流/temp/Chinese.txt");
        FileOutputStream fo=new FileOutputStream("java入门/IO流/temp/copy.txt");
        //解码的时候把文件的顺序交换一下--->原理主要还是异或的知识
        int b;
        while ((b=fi.read())!=-1){
            fo.write(b^2);
        }
        fo.close();
        fi.close();
    }
}
