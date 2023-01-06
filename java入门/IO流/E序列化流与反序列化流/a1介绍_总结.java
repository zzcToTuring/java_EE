package IO流.E序列化流与反序列化流;

public class a1介绍_总结 {
    public static void main(String[] args) {
        /**
         * 序列化流与反序列化流属于字节流中的一种高级流
         * 可以把java对象写到本地文本中   <---->  可以从本地文本中读取java对象
         *  当对象想保存在本地 又不想被别人查看或修改的时候，就可以使用这种方式进行操作
         *
         * 序列化流
         *      1、构造方法
         *          public objectOutputStream(OutputStream out) 把基本流包装成高级流
         *      2、成员方法
         *          public final void writeObject(Object obj) 把对象序列化写到文件中去
         *  反序列化流
         *      1、构造方法
         *          public ObjectInputStream(InputStream out)  把基本流变成高级流
         *      2、成员方法
         *          public Object readObject()  把序列化到本地文件中的对象，读到程序中来
         *
         *
         *-----------------------------------------------------------------------
         * 总结：
         *  1、使用序列化流将对象写到文件时，需要让Javabean类实现Serializable接口。
         *      否则，会出现NotSerializableException异常
         *      （他没有要实现的方法，只是一个标记）
         *  2、序列化流写到文件中的数据是不能修改的，一旦修改就无法再次读回来了（安全性）
         *  3、序列化对象后，修改了Javabean类，再次反序列化，会出问题，会抛出InvalidclassException异常
         *      原因--->版本号变了--->给Javabean类添加serialVersionUID(序列号、版本号)--->确保其不发生改变，这样不报错了
         *  4、如果一个对象中的某个成员变量的值不想被序列化，给该成员变量加transient关键字修饰
         *      这样这个变量不会被序列化了--->同理，读的时候也不会被读出，因为压根就没有写进去
         *
         *
         */


    }
}
