package IO流.E序列化流与反序列化流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class a2序列化流 {
    public static void main(String[] args) throws IOException {
        student s1=new student("zs",20,"jx");
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("java入门/IO流/E序列化流与反序列化流/序列化.txt"));
        oos.writeObject(s1);
        oos.close();
    }
}
