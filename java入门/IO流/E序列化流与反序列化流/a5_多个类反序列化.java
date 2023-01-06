package IO流.E序列化流与反序列化流;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class a5_多个类反序列化 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("java入门/IO流/E序列化流与反序列化流/序列化.txt"));
        ArrayList<student> list= (ArrayList<student>) ois.readObject();
        for (student student : list) {
            System.out.println(student);
        }
        ois.close();
    }
}
