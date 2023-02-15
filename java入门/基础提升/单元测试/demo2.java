package 基础提升.单元测试;

import org.junit.Assert;
import org.junit.Test;

//使用断言 当结果不符合预期结果的时候报错
//所有的方法均有一个返例 not
public class demo2 {
    @Test
    public void test1(){
        demo1 demo=new demo1();
        String need="3";
        //基础用法  Assert.assertEquals(“展示内容”,期待的值,实际的值)  不相同则报错
        //TIP: 调用的是equals方法比较 比如数组的equals是看他的地址是否相同
        Assert.assertEquals("与预期结果不匹配",need,demo.test3());

        //针对数字方面 Assert.assertEquals("展示内容",期待的值,真实的值,允许偏差的范围);
        Assert.assertEquals("不满足条件",20,20.3,0.5);

        //直接使用Boolean值判断是否相同 Assert.assertTrue(“展示内容”,boolean) T表示通过 F 表示为假不通过
        Assert.assertTrue("不相同",true);

        //判断数组的值是否相同 Assert.assertArrayEquals("展示内容",期待数组，真实数组)
        Assert.assertArrayEquals("不匹配",new int[]{1,2,3},new int[]{1,2,3});

    }

    @Test
    public void test2(){
        //直接抛出异常 Assert.fail("展示内容");
        //Assert.fail("看你不爽直接不符合");
        String a=new String("a");
        String b=new String("a");

        //比较equals
        Assert.assertEquals("值不相等",a,b);
        //比较是否是同一个对象
        Assert.assertSame("不是同一个对象",a,b);
    }

}
