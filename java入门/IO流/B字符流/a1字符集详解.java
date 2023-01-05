package IO流.B字符流;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class a1字符集详解 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /**
         * 计算机的存储规则（常见）：
         *  GBK字符集：
         *      1、简介
         *          2000年3月17日发布，收集21003个汉字（windows系统默认使用的是gbk）
         *      2、存储规则（英文）
         *          使用ASCII码对应字母，一个字母占1个字节
         *      3、存储规则（中文）
         *          汉字--->查询GBK--->对应数字--->编码（汉字占2字节，高位字节二进制以1开头，转化十进制是一个负数）
         *          --->解码--->得到数字--->读取汉字
         *
         *
         *  Unicode字符集
         *      1、简介
         *          国际标准字符集，他将世界各种语言的每个字符定义一个唯一的编码，以满足跨语言，跨平台的文本信息转化
         *          utf-16--->一个（字符或汉字）占用4字节
         *          utf-32--->一个（字符或汉字）占用5字节
         *          常用！--->utf-8--->用1-4个字节保存（英文1个 汉字3个）
         *      2、utf-8存储规则
         *          汉字-->查询Unicode-->对应的数字--->1110XXXX 10XXXXXX 10XXXXXX(X表示对应的数字)--->解码
         *       3、utf-8总结
         *          1、一个英文占1个字节，二进制第一位是0，转化成十进制是正数
         *          2、一个中文占3个字节，二进制第一位是1，第一个字节转化成十进制是负数
         *
         *  为什么会有乱码
         *      1、读取的方式不对(gbk一次占2个字节，utf-8占3个字节)
         *      2、编码解码的方式不对(utf-8的使用gbk的方式解码，以至于得到一个错误的结论)
         *
         *  如何不产生乱码
         *      1、不用使用字节流读取文本文件
         *      2、编码解码时使用同一个码表，使用同一个编码方式
         *
         *  使用场景
         *      字节流--->拷贝任意类型的文件
         *      字符流--->读取纯文本文件中的数据 || 往纯文本文件中写出数据
         *
         *  java中的编码方法
         *      public byte[] getBytes()  使用默认方式进行编码
         *      public byte[] getBytes(String charsetName) 使用指定方式进行编码
         *  java中的解码方法
         *      String(byte[] bytes)  使用默认方式进行解码
         *      String(byte[] bytes,String charsetName) 使用指定方式进行解码
         */

        String s1="测试中文";
        byte b1[]=s1.getBytes("gbk");
        System.out.println(new String(b1,"gbk"));
        System.out.println(new String(b1, StandardCharsets.UTF_8));
        System.out.println("-----------------------------------");
        byte b2[]=s1.getBytes(StandardCharsets.UTF_8);
        System.out.println(new String(b2,"gbk"));
        System.out.println(new String(b2, StandardCharsets.UTF_8));
    }
}
