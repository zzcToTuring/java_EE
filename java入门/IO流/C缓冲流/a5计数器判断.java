package IO流.C缓冲流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class a5计数器判断 {
    public static void main(String[] args) throws IOException {
        /**
         *   实现一个验证程序运行次数的小程序，要求如下：
         *        1.当程序运行超过3次时给出提示:本软件只能免费使用3次,欢迎您注册会员后继续使用~
         *        2.程序运行演示如下:
         *             第一次运行控制台输出: 欢迎使用本软件,第1次使用免费~
         *             第二次运行控制台输出: 欢迎使用本软件,第2次使用免费~
         *             第三次运行控制台输出: 欢迎使用本软件,第3次使用免费~
         *             第四次及之后运行控制台输出:本软件只能免费使用3次,欢迎您注册会员后继续使用~
         */
        BufferedReader br=new BufferedReader(new FileReader("java入门/IO流/temp/count.txt"));
        String line=br.readLine();
        br.close();
        int count=Integer.parseInt(line);
        count++;
        if(count <= 3){
            System.out.println("欢迎使用本软件,第"+count+"次使用免费~");
        }else{
            System.out.println("本软件只能免费使用3次,欢迎您注册会员后继续使用~");
        }
        FileWriter fw=new FileWriter("java入门/IO流/temp/count.txt");
//        fw.write(new String(String.valueOf(count)));
        fw.write(count+"");
        fw.close();

    }
}
