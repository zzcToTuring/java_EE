package file;

import java.io.File;

public class a1初识file {
    public static void main(String[] args) {
        /**
         * file:对象的表示路径，也可以是文件，同样的也可以是文件夹，可以是存在的也可以是不存在的
         * file的构造方法：
         *    public File(String pathname)                根据文件路径创建文件对象
         *    public File(String parent, String child)    根据父路径名字符串和子路径名字符串创建文件对象
         *    public File(File  parent, String child)     根据父路径对应文件对象和子路径名字符串创建文件对象
         */
        File file1=new File("temp\\a.txt");
        System.out.println(file1);

        //使用file对文件进行拼接
        //根据构造函数可得，第一个参数可以为string或file，第二个参数只能为string
        File father=new File("C:\\Users\\ASUS\\Desktop\\");
        String son="file.txt";
        File file2=new File(father,son);
        System.out.println(file2);
    }
}
