package file.file练习;

import java.io.File;

public class a2查找指定文件夹 {
    public static void main(String[] args) {
        //在temp目录下 查找所有txt文件
        //获取所有的文件
        File files=new File("D:\\java_code\\java_EE\\java入门\\file\\temp");
        find(files);

    }
    //函数 准备遍历操作
    public static void find(File name){
        File[] file=name.listFiles();
        if (file !=null){
            //遍历这个文件夹下的操作 如果是文件的话则根据文件名进行判断 如果是文件夹的话 那么把这个文件夹在进行遍历操作
            for (File file1 : file) {
                if (file1.isFile()){
                    //是文件的话 执行查找代码
                    if (file1.getName().endsWith(".txt")){
                        System.out.println(file1);
                    }
                }else {
                    find(file1);
                }
            }
        }

    }
}
