import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class test {
    public static final Logger LOGGER = LoggerFactory.getLogger("test.class");
    public static void main(String[] args) {
        System.out.println("模拟登录页面记录用户操作\n 请输入用户名：");
        Scanner in =new Scanner(System.in);
        String name=in.nextLine();
        if (name.equals("admin")){
            System.out.println("欢迎admin");
            LOGGER.info("用户使用用户名admin登录");
        }else{
            System.out.println("暂无权限");
            LOGGER.info("用户使用其他方式进行登录");
        }
    }
}
