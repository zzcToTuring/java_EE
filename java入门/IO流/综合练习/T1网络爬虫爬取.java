package IO流.综合练习;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T1网络爬虫爬取 {
    public static void main(String[] args) throws IOException {
        //爬取百家姓网站内容 https://hanyu.baidu.com/shici/detail?from=kg1&highlight=&pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&srcid=51369

        StringBuilder sb=new StringBuilder();
        //创建一个URL对象
        URL url=new URL("https://hanyu.baidu.com/shici/detail?from=kg1&highlight=&pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&srcid=51369");
        //链接地址
        URLConnection conn=url.openConnection();
        //读取数据(链接的是字节，但有些数据是中文 需要转化成字符流)
        InputStreamReader isr=new InputStreamReader(conn.getInputStream());

        int ch;
        while ((ch=isr.read())!=-1){
            sb.append((char) ch);
        }
        //网页的数据已经放在sb里面，使用正则表达式进行过滤放在list中
        ArrayList<String> list=new ArrayList<>();
        Pattern pattern=Pattern.compile("(.{4})(，|。)");
        Matcher matcher = pattern.matcher(sb.toString());
        while (matcher.find()){
            String group=matcher.group(1);
            list.add(group);
        }

    }
}
