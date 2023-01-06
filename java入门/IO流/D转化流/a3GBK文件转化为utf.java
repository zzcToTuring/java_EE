package IO流.D转化流;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class a3GBK文件转化为utf {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("java入门/IO流/temp/gbk格式文档.txt", Charset.forName("gbk"));
        FileWriter fw=new FileWriter("java入门/IO流/temp/temp.txt", StandardCharsets.UTF_8);
        int b;
        while ((b=fr.read())!=-1){
            fw.write(b);
        }
        fw.close();
        fr.close();
    }
}
