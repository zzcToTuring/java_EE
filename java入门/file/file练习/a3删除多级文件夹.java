package file.file练习;

import java.io.File;

public class a3删除多级文件夹 {
    public static void main(String[] args) {
        //删除temp.Q3文件夹
        File f=new File("D:\\java_code\\java_EE\\java入门\\file\\temp\\Q3");
        delete(f);
    }

    private static void delete(File f) {
        File[] files=f.listFiles();
        for (File file : files) {
            //如果是文件 直接删除
            if (file.isFile()){
                file.delete();
            }else {
                //如果是文件夹的话 进行递归操作
                delete(file);
            }
        }
        //这个文件夹下面没有文件了 那么可以删除这个文件夹了
        f.delete();
    }
}
