package 行为型模式.状态模式.导入案例;
//电梯对象
public interface Ilift {
    int open=1;
    int close=2;
    int run=3;
    int stop=4;
    void setState(int state);//电梯的状态功能
    void open();
    void close();
    void run();
    void stop();
}
