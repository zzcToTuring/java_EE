package 行为型模式.状态模式.导入案例;
//实现类 为了实现电梯类的接口
public class lift implements  Ilift {
    private int state;


    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (state) {//在不同的状态做着不同的事情
            case open:
                break;
            case close:
                System.out.println("门开了......");
                setState(open);
                break;
            case stop:
                System.out.println("门开了......");
                setState(open);
                break;
            case run:
                break;
        }
    }

    @Override
    public void close() {
        switch (state) {//在不同的状态做着不同的事情
            case open:
                System.out.println("关门了....");
                setState(close);
                break;
            case close:
                break;
            case stop:
                System.out.println("关门了......");
                setState(close);
                break;
            case run:
                break;
        }
    }

    @Override
    public void run() {
        switch (state) {//在不同的状态做着不同的事情
            case open:
                break;
            case close:
                System.out.println("开始运行......");
                setState(run);
                break;
            case stop:
                System.out.println("开始运行......");
                setState(run);
                break;
            case run:
                break;
        }
    }

    @Override
    public void stop() {
        switch (state) {//在不同的状态做着不同的事情
            case open:
                break;
            case close:
                System.out.println("电梯停止了");
                setState(stop);
                break;
            case stop:
                break;
            case run:
                System.out.println("电梯停止了");
                setState(stop);
                break;
        }
    }
}