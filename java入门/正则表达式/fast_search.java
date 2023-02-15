package 正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fast_search {
    public void test1(){
        //根据正则表达式判断是否符合
        String s="xxx";
        s.matches("");

    }
    public void test2(){
        //根据string 正则表达式查找 要展示查找的值
        String s="xxx";
        //创建正则表达式对象
        Pattern compile = Pattern.compile("");
        //指定字符串查找
        Matcher matcher = compile.matcher(s);
        //开始查找 (如果有多处就使用while循环遍历查找)
        while (matcher.find()) {
            //group表示分组号 为空表示所有
            String index=matcher.group();
            System.out.println(index);
        }
    }
}
