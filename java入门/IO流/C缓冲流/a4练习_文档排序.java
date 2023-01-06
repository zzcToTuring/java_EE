package IO流.C缓冲流;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class a4练习_文档排序 {
    public static void main(String[] args) throws IOException {
        //文档中的数据：2-1-9-4-7-8
        //对其重写进行排序，使用字符流
        FileReader fr=new FileReader("java入门/IO流/temp/sort.txt");
        StringBuilder sb=new StringBuilder();
        int len;
        //读取数据
        while ((len=fr.read())!=-1){
            sb.append((char) len);
        }
        fr.close();
        String str=sb.toString();
        //分割有用的数据并存入
        String[] arrStr=str.split("-");
        ArrayList<Integer> list=new ArrayList<>();
        for (String s : arrStr) {
            int i=Integer.parseInt(s);
            list.add(i);
        }
        //排序
        Collections.sort(list);
        FileWriter fw=new FileWriter("java入门/IO流/temp/temp.txt");
       for (int i=0;i<list.size();i++){
           if (i==list.size()-1){
               fw.write(list.get(i)+"");
           }
           else {
               fw.write(list.get(i)+"-");
           }
       }
        fw.close();



    }

}
