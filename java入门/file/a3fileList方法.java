package file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class a3fileList方法 {
    public static void main(String[] args) {
        /**
         * （了解）public static File[] listRoots()                列出可用的文件系统根
         * （了解）public String[] list()                          获取当前该路径下所有内容(仅仅能获取名字)
         * （了解）public String[] list(FilenameFilter filter)     利用文件名过滤器获取当前该路径下所有内容
         * （掌握）public File[] listFiles()                获取当前该路径下所有内容
         * （了解）public File[] listFiles(FileFilter filter)      利用文件名过滤器获取当前该路径下所有内容
         * （了解）public File[] listFiles(FilenameFilter filter)  利用文件名过滤器获取当前该路径下所有内容
         */
        File f1=new File("D:\\java_code\\java_EE\\java入门\\file\\temp");
        //列出所有系统可用的根
        File[] arr1 = File.listRoots();
        System.out.println(Arrays.toString(arr1));
        //获取当前路径的所有内容
        System.out.println(Arrays.toString(f1.list()));
        //利用文件名过滤器获取当前路径下所有内容 参数一表示父级路径 参数二表示子级路径
        String[] arr2=f1.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                System.out.println("  dir  "+dir +"  name "+name);
                return name.endsWith("txt");
            }
        });
        System.out.println(Arrays.toString(arr2));

        System.out.println("----------------------------");
        //最常用的 listFile--->获取当前该路径下所有内容
        for (File file : f1.listFiles()) {
            if (file.isFile()&&file.getName().endsWith("txt")){
                System.out.println(file);
            }
        }
    }
}
