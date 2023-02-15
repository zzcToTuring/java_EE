package 基础提升.单元测试;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//测试程序是否能删除a.txt
public class demo3 {

    @Before
    public void before() throws IOException {
        //在之前由于不能真正删除a.txt只是测试，因此要备份
        FileInputStream fi=new FileInputStream(new File("D:\\java_code\\java_EE\\java入门\\基础提升\\单元测试\\a.txt"));
        FileOutputStream fo=new FileOutputStream(new File("D:\\java_code\\java_EE\\java入门\\基础提升\\单元测试\\copy.txt"));

        int b;
        while ((b=fi.read())!=-1){
            fo.write(b);
        }
        fo.close();
        fi.close();
    }


    @Test
    public void delete(){
        File file = new File("D:\\java_code\\java_EE\\java入门\\基础提升\\单元测试\\a.txt");
        Assert.assertTrue("文件不存在", file.exists());
        boolean delete = file.delete();
        Assert.assertTrue("删除失败",delete);
    }

    @After
    public void after() throws IOException{
        //把备份还原 不污染原数据
        FileInputStream fi=new FileInputStream(new File("D:\\java_code\\java_EE\\java入门\\基础提升\\单元测试\\copy.txt"));
        FileOutputStream fo=new FileOutputStream(new File("D:\\java_code\\java_EE\\java入门\\基础提升\\单元测试\\a.txt"));

        int b;
        while ((b=fi.read())!=-1){
            fo.write(b);
        }

        fo.close();
        fi.close();
        //把制造的文件进行删除
        new File("D:\\java_code\\java_EE\\java入门\\基础提升\\单元测试\\copy.txt").delete();
    }
}
