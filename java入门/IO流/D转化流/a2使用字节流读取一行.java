package IO流.D转化流;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class a2使用字节流读取一行 {
    public static void main(String[] args) throws IOException {
        //字节流读取一行 1、字节流--->字符流 2、字符流--->缓冲字符流
        FileInputStream f=new FileInputStream("java入门/IO流/temp/csb.txt");
        InputStreamReader ir=new InputStreamReader(f);

        BufferedReader br=new BufferedReader(ir);
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}
