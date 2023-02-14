package IO流;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class test {
    public static void main(String[] args) throws IOException {
        //使用字符流
        FileReader fr=new FileReader("D:\\java_code\\java_EE\\java入门\\IO流\\up主视频.txt");
        FileWriter fw=new FileWriter("D:\\java_code\\java_EE\\java入门\\IO流\\result.txt", StandardCharsets.UTF_8);
        BufferedReader bf=new BufferedReader(fr);
        BufferedWriter bw=new BufferedWriter(fw);
        //读取全部读取
        String b;
        while ((b=bf.readLine())!=null){
            bw.write(b.replaceAll("rsshub.app", "rsshub.sksren.com").trim());
            bw.newLine();
       }
        bw.close();
        bf.close();
        fw.close();
        fr.close();
    }
}


//        String temp;
//        while ((temp=bf.readLine())!=null){
//
//        }