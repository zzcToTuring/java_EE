package IO流.C缓冲流;

import java.io.*;
import java.util.TreeMap;

public class a7出师表的顺序排列_2 {
    public static void main(String[] args) throws IOException {
        //使用TreeMap--->特点：不重复、无索引、可排序
        BufferedReader br = new BufferedReader(new FileReader("java入门/IO流/temp/csb.txt"));
        String line;
        TreeMap<Integer,String> tm = new TreeMap<>();
        while((line = br.readLine()) != null){
            String[] arr = line.split("\\.");
            //0：序号  1 ：内容
            tm.put(Integer.parseInt(arr[0]),line);
        }
        br.close();

        BufferedWriter bw=new BufferedWriter(new FileWriter("java入门/IO流/temp/temp.txt"));
//        tm.forEach(new BiConsumer<Integer, String>() {
//            @Override
//            public void accept(Integer integer, String s) {
//                try {
//                    bw.write(s);
//                    bw.newLine();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//        });
        for (Integer integer : tm.keySet()) {
            System.out.println(tm.get(integer));
            bw.write(tm.get(integer));
            bw.newLine();
        }
        bw.close();

    }
}
