package file;

import java.io.File;
import java.io.IOException;

public class a2file的一些方法 {
    public static void main(String[] args) throws IOException {
        /**
         *   public boolean isDirectory()        判断此路径名表示的File是否为文件夹（如果文件不存在返回false）
         *   public boolean isFile()             判断此路径名表示的File是否为文件(如果不存在返回false)
         *   public boolean exists()             判断此路径名表示的File是否存在
         *
         *   public long length()                返回文件的大小（字节数量）
         *   细节：
         *      1、方法只能获取文件的大小，单位是字节(获取M,G需要不断除以1024)
         *      2、如果获取文件夹的大小的话，会返回0(无法获取文件夹的大小)
         *
         *   public String getAbsolutePath()     返回文件的绝对路径
         *   public String getPath()             返回定义文件时使用的路径（创建时候的的名称new File(xxx)）
         *   public String getName()             返回文件的名称，带后缀
         *   public long lastModified()          返回文件的最后修改时间（时间毫秒值）
         *
         *   public boolean createNewFile()      创建一个新的空的文件
         *   细节：
         *   1、如果当前路径表示的文件夹不存，则创建成功返回true；如果当前路径存在，则创建的失败返回false
         *   2、如果父级的路径是不存在的，那么方法会有IO异常
         *   3、他一定是创建一个文件，如果路径中不包含后缀名，那么会创建一个没有后缀的文件
         *
         *   public boolean mkdir()              创建单级文件夹
         *   1、windows当中路径是唯一的，如果当前路径已经存在，则创建失败，返回false
         *   2、mkdir方法只能创建单级文件夹，无法创建多级文件夹。
         *   public boolean mkdirs()             创建多级文件夹(常用||既可以创建单级的，又可以创建多级的文件夹)
         *   public boolean delete()             删除文件、空文件夹
         *    如果删除的是文件，则直接删除，不走回收站。
         *    如果删除的是空文件夹，则直接删除，不走回收站
         *    如果删除的是有内容的文件夹，则删除失败
         */
        File file1=new File("D:\\java_code\\java_EE\\java入门\\file\\temp\\a.txt");
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.length());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.lastModified());

        File file2=new File("D:\\java_code\\java_EE\\java入门\\file\\temp\\c.txt");
        System.out.println(file2.createNewFile());

        File file3=new File("D:\\java_code\\java_EE\\java入门\\file\\temp\\b\\c\\temp");
//        System.out.println(file3.mkdir());
        System.out.println(file3.mkdirs());
        System.out.println(file3.delete());



    }
}
