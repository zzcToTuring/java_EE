package 基础提升.xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class A1_解析xml文件 {
    public static void main(String[] args) throws DocumentException {
        //创建解析对象
        SAXReader saxReader = new SAXReader();
        File file = new File("java入门/基础提升/xml/test.xml");
        //获取xml整体文件
        Document read = saxReader.read(file);
        //获取根节点
        Element rootElement = read.getRootElement();
        //由根节点获取所有子节点
        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            Attribute id = element.attribute("id");
            String id_text=id.getText();
            String elementName = element.getName();
            String name = element.element("name").getText();
            String age = element.element("age").getText();
            boolean admin = Boolean.parseBoolean(element.element("admin").getText());
            System.out.println(elementName+id_text+"  name:  "+name+" age: "+age+"是否为管理员 " +admin);
        }

        //直接获取元素的属性值
        System.out.println(elements.get(2).elementText("name"));
    }
}
