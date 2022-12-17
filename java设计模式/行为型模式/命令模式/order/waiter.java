package 行为型模式.命令模式.order;

import java.util.ArrayList;
import java.util.List;

//调用者
//服务员类
public class waiter {
    //一个服务员有多个命令，因此使用集合来转载命令
    private List<orderCommand> command=new ArrayList<orderCommand>();//command也行，因为ordercommand实现了command的接口嘛
    //服务员设置对象
    public void setCommand(orderCommand com){
        command.add(com);//服务员把命令添加到命令类中
    }
    public void say(){
        System.out.println("收到订单了.....");
        for (orderCommand command:command) {
            if (command!=null){
                command.excute();//执行命令
            }
        }
    }
}
