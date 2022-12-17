package 行为型模式.状态模式.导入案例;

public class test {
    public static void main(String[] args) {
        lift lift=new lift();
        lift.setState(Ilift.close);
        //对电梯进行操作
        lift.open();

        lift.close();
        lift.run();
        lift.stop();
    }
}
/*
分析：使用了大量的Switch...case这样的判断（if-else也是同理），这样使得程序的可阅读性变差
同时他的扩展性也比较差，但增加新的状态时候，几乎要对所有的逻辑进行更改
 */
