package 结构型模式.桥接模式.播放器案例;
//抽象的操作系统类（抽象化角色）
public abstract class abstractOS {
    //声明videofile对象
    protected videoFile videoFile;
    //生成构造方法
    public abstractOS(videoFile videoFile) {
        this.videoFile = videoFile;
    }
    //生成抽象方法 播放视频文件
    public abstract void play(String fileName);
}
