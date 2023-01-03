package file.file练习;
/**
 * 均使用到了递归操作
 */

import java.io.File;
import java.util.HashMap;

public class a4统计文件夹中的每种文件 {
    public static void main(String[] args) {
        File f = new File("D:\\java_code\\java_EE\\java入门\\file\\temp");
        HashMap<String, Integer> mp = getCount(f);
        System.out.println(mp);
    }

    private static HashMap<String, Integer> getCount(File f) {
        HashMap<String, Integer> hm = new HashMap<>();
        File[] files = f.listFiles();
        //遍历数组的操作
        for (File file : files) {
            if (file.isFile()) {
                String name = file.getName();
                //分割 注意转义字符
                String[] arr = name.split("\\.");
                if (arr.length >= 2) {
                    String endName = arr[arr.length - 1];
                    if (hm.containsKey(endName)) {
                        //map中已经存在
                        int count = hm.get(endName);
                        count++;
                        hm.put(endName, count);
                    } else {
                        hm.put(endName, 1);
                    }
                }
            }else {
                //长度不是2 什么原因--->是文件夹--->进行递归操作
                HashMap<String, Integer> sonMap = getCount(file);
                sonMap.forEach((key, value) -> {
                    if (hm.containsKey(key)) {
                        //hm集合中存在 直接son.value+hm.value
                        int count=hm.get(key);
                        count=count+value;
                        hm.put(key,count);
                    }else {
                        //hm集合中不存在 那么直接把son.value添加
                        hm.put(key,value);
                    }
                });
            }
        }
        return hm;
    }
}
