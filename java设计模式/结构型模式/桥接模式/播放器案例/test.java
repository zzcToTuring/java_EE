package 结构型模式.桥接模式.播放器案例;

public class test {
    public static void main(String[] args) {
        abstractOS windows=new windows(new AVIfile());
        windows.play("电影一");
    }
}
