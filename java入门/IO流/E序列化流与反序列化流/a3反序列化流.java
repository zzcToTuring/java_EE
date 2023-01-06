package IO流.E序列化流与反序列化流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class a3反序列化流 {
    public static void main(String[] args) throws IOException,ClassNotFoundException {

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("java入门/IO流/E序列化流与反序列化流/序列化.txt"));
        student s= (student) ois.readObject();
        System.out.println(s);
    }
}
