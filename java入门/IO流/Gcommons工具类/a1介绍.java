package IO流.Gcommons工具类;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class a1介绍 {
    public static void main(String[] args) throws IOException {
        /**
         * Apache Commons是Apache软件基金会的项目，其中的Commons是一个工具类，里面有很多方便实用的工具类
         * 在io领域，我们介绍一下常用io的工具类--->有相关的.md文件作为参考
         *
         * 常见的操作
         *  FileUtils类
         *           static void copyFile(File srcFile, File destFile)                   复制文件
         *           static void copyDirectory(File srcDir, File destDir)                复制文件夹（CV操作）
         *           static void copyDirectoryToDirectory(File srcDir, File destDir)     复制文件夹(建立一个文件夹dest，再进行CV操作)
         *           static void deleteDirectory(File directory)                         删除文件夹(ctrl+d)
         *           static void cleanDirectory(File directory)                          清空文件夹(里面的文件清空，文件夹还在)
         *           static String readFileToString(File file, Charset encoding)         读取文件中的数据变成成字符串
         *           static void write(File file, CharSequence data, String encoding)    写出数据
         *
         *IOUtils类
         *           public static int copy(InputStream input, OutputStream output)      复制文件
         *           public static int copyLarge(Reader input, Writer output)            复制大文件
         *           public static String readLines(Reader input)                        读取数据
         *           public static void write(String data, OutputStream output)          写出数据
         *
         */
        //举例--->复制文件 a.txt--->temp.txt
        File src=new File("java入门/IO流/temp/c.txt");
        File dest=new File("java入门/IO流/temp/temp.txt");
        FileUtils.copyFile(src,dest);

        String s = FileUtils.readFileToString(src, StandardCharsets.UTF_8);
        System.out.println(s);
    }
}
