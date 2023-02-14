package IO流;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class test2 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("D:\\java_code\\java_EE\\java入门\\IO流\\result.txt");
        FileWriter fw=new FileWriter("D:\\java_code\\java_EE\\java入门\\IO流\\R8.txt", StandardCharsets.UTF_8);
        BufferedReader bf=new BufferedReader(fr);
        BufferedWriter bw=new BufferedWriter(fw);
        //跳过
        for (int i = 0; i <35000 ; i++) {
            bf.readLine();
        }
//        for (int i = 0; i <5000 ; i++) {
//            String b= bf.readLine();
//            bw.write(b.replaceAll("[a-zA-Z0-9]", "").trim());
//            bw.newLine();
//        }
        String b;
        while ((b=bf.readLine())!=null){
            bw.write(b.replaceAll("[a-zA-Z0-9]", "").trim());
            bw.newLine();
        }
        bw.close();
        bf.close();
        fw.close();
        fr.close();
    }
}

