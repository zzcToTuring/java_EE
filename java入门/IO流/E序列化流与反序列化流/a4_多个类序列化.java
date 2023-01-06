package IO流.E序列化流与反序列化流;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class a4_多个类序列化 {
    public static void main(String[] args) throws Exception{
        //多个类进行序列化，在反序列化时候比较麻烦，我们可以把他放到集合中处理
        ArrayList<student> list=new ArrayList<>();
        student s1=new student("zs",12,"jx");
        student s2=new student("ls",14,"sh");
        student s3=new student("ww",17,"gz");
        Collections.addAll(list,s1,s2,s3);
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("java入门/IO流/E序列化流与反序列化流/序列化.txt"));
        oos.writeObject(list);
        oos.close();
    }
}
