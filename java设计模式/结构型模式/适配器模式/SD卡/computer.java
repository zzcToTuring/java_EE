package 结构型模式.适配器模式.SD卡;
//定义一个计算机，只能在SD卡中读取数据
public class computer {
    //电脑读取SD卡
      public String readSD(SDcard sDcard){
        if (sDcard ==null){
            throw new NullPointerException("没有哦插入SD卡");
        }
        return sDcard.readSD();
      }
      //电脑从SD卡中写入数据
      public void writeSD(SDcard sDcard,String msg){
          if (sDcard ==null){
              throw new NullPointerException("没有插入SD卡哦");
          }
          sDcard.writeSD(msg);
      }
}
