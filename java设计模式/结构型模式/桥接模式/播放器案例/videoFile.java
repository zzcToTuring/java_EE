package 结构型模式.桥接模式.播放器案例;
//视频文件（实现化角色）
public interface videoFile {
    //解码方法
    void decode(String fileName);
}
