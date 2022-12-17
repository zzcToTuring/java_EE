package 结构型模式.桥接模式.播放器案例;
//操作系统
public class windows extends abstractOS{
    //
    public windows(videoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
