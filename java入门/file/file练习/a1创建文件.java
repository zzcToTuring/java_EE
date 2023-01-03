package file.file练习;

import java.io.File;
import java.io.IOException;

public class a1创建文件 {
    public static void main(String[] args)throws IOException {
        //需求：在temp文件夹 创建Q1.Q1.txt
        File f1=new File("D:\\java_code\\java_EE\\java入门\\file\\temp\\Q1");
        //创建Q1文件夹 因为不确定他是否存在
        f1.mkdirs();
        File f2=new File(f1,"Q1.txt");
        f2.createNewFile();
    }
}
