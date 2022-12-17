package 结构型模式.桥接模式.播放器案例;
//扩展抽象化角色
public class mac extends abstractOS{

    public mac(videoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
