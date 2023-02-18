package 基础提升.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.util.List;

public class A2_Xpath解析 {
    //获取相关对象
    static SAXReader saxReader = new SAXReader();
    static File file=new File("java入门/基础提升/xml/test2.xml");
    static Document document;
    static {
        try {
            document = saxReader.read(file);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1() {
        //绝对路径检索，获取所有的姓名
        List<Node> nodes = document.selectNodes("/persons/person/name");
        for (Node node : nodes) {
            System.out.println(node.getText());
        }
    }

    @Test
    public void test2(){
        //使用相对路径获取,此时已经获取了根节点，这是相对于根节点而言
        Element rootElement = document.getRootElement();
        List<Node> nodes = rootElement.selectNodes("./person/name");
        for (Node node : nodes) {
            System.out.println(node.getText());
        }

    }
    @Test
    public void test3(){
        //使用全文检索的方式查找
        System.out.println("===========获取任意的name=============");
        List<Node> nodes = document.selectNodes("//name");
        for (Node node : nodes) {
            System.out.println(node.getText());
        }
        System.out.println("============获取person下的所有name==============");
        List<Node> nodes1 = document.selectNodes("//person//name");
        for (Node node : nodes1) {
            System.out.println(node.getText());
        }
        System.out.println("=============获取person下子标签的name==============");
        List<Node> nodes2 = document.selectNodes("//person/name");
        for (Node node : nodes2) {
            System.out.println(node.getText());
        }
    }

    @Test
    public void test4(){
        //获取boss=true中的name
        Node node = document.selectSingleNode("//person[@boss='true']//name");
        System.out.println(node.getText());
        //获取含有boss属性 中 第一个a的type值
        Node node1 = document.selectSingleNode("//person[@boss]/a/@type");
        System.out.println(node1.getText());
        System.out.println(node1.getName());
    }

}
