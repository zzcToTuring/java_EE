package 基础提升.单元测试;

import org.junit.Test;

public class demo1 {
    @Test
    public  void test1(){
        System.out.println("test_1");
    }

    @Test
    public void test2(){
        System.out.println("test_2");
    }

    public String test3(){
        System.out.println("test_3");
        return "3";
    }

}
