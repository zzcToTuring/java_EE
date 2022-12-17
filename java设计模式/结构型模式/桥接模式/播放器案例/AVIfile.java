package 结构型模式.桥接模式.播放器案例;
//AVI视频文件（具体的实现化角色）
public class AVIfile implements videoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件：" + fileName);
    }
}
