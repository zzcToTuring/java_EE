package IO流.综合练习;

import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.util.List;
import java.util.regex.Pattern;

public class T2使用Hutool包爬取 {
    public static void main(String[] args) {
        String listCount= HttpUtil.get("https://hanyu.baidu.com/shici/detail?from=kg1&highlight=&pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&srcid=51369");
        //使用正则表达式获取
        System.out.println(listCount);
        Pattern pattern = Pattern.compile("(.{4})(，|。)");
        List<String> list= ReUtil.findAll(pattern,listCount,1);
        System.out.println(list);


    }
}
