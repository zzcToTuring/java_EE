package IO流.C缓冲流;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class a6出师表的顺序排列 {
    public static void main(String[] args) throws IOException {
        //方式1--->传统方式
        BufferedReader b=new BufferedReader(new FileReader("java入门/IO流/temp/csb.txt"));
        String line;
        ArrayList<String> list = new ArrayList<>();
        while((line = b.readLine()) != null){
            list.add(line);
        }
        b.close();
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int q=Integer.parseInt(o1.split("\\.")[0]);
                int w=Integer.parseInt(o2.split("\\.")[0]);
                return q-w;
            }
        });
//        System.out.println(list);
        BufferedWriter bw=new BufferedWriter(new FileWriter("java入门/IO流/temp/temp.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
