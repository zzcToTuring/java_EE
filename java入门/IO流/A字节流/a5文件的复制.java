package IO流.A字节流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class a5文件的复制 {
    public static void main(String[] args) throws IOException {
        //复制文件c.txt--->copy.txt
        FileInputStream fi=new FileInputStream(new File("java入门\\IO流\\temp\\test.pdf"));
        FileOutputStream fo=new FileOutputStream(new File("java入门\\IO流\\temp\\copy.pdf"));
        //读取文件--->采取大文件读取的形式--->这样复制的东西多 但是注意数组也是会占用内容的，需要自己好好把握
        byte[] chars=new byte[1024*1024*5];
        int len;
        while ((len=fi.read(chars))!=-1){
            fo.write(chars,0,len);
        }

        /*int len;
        while ((len=fi.read())!=-1){
            fo.write(len);
        }*/
        fo.close();
        fi.close();
    }
}
