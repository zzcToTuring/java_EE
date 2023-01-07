package IO流.HuTool工具类;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a1介绍 {
    public static void main(String[] args) throws Exception{
        /**
         * 与上面的commons相同，HuTool也是一个工具类
         * 官网：
         * 	    https://hutool.cn/
         * API文档：
         * 	    https://apidoc.gitee.com/dromara/hutool/
         * 中文使用文档：
         * 	    https://hutool.cn/docs/#/
         *
         * 使用
         *      他文档里面不仅含有io流的，也含有其他的写作方法的，首先需要导入jar包
         *      在API文档中（左上）搜索cn.hutool.core.io
         *      在API文档中（坐下）点击相关的类 FileUtil
         *      即可在右边查找到相关的方法
         *
         * 举例一些常见的方法：
         *              FileUtil类:
         *                 file：根据参数创建一个file对象（可是使用... 这样可以更简单的创建对象）
         *                 touch：根据参数创建文件（原：父类不存在创建不了 现：父类不存在创建）
         *
         *                 writeLines：把集合中的数据写出到文件中，覆盖模式。
         *                 appendLines：把集合中的数据写出到文件中，续写模式。
         *                 readLines：指定字符编码，把文件中的数据，读到集合中。
         *                 readUtf8Lines：按照UTF-8的形式，把文件中的数据，读到集合中
         *                 copy：拷贝文件或者文件夹
         *
         */
        File file1 = FileUtil.file("java入门", "IO流", "temp", "Chinese.txt");

        System.out.println(file1);
//        File file2=FileUtil.file("D:\\java_code\\java_EE\\java入门\\IO流\\temp\\a\\temp.txt");
//        File touch = FileUtil.touch(f);
//        System.out.println(touch);
        //集合写入
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"123","456","789");
        FileUtil.appendLines(list,"D:\\java_code\\java_EE\\java入门\\IO流\\temp\\temp.txt","utf-8");

        //集合读取（特意选用了gbk格式的文件做测试）
        List<String> list1 = FileUtil.readLines("D:\\java_code\\java_EE\\java入门\\IO流\\temp\\gbk格式文档.txt", "gbk");
        System.out.println(list1);

    }
}
