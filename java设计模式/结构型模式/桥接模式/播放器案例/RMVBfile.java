package 结构型模式.桥接模式.播放器案例;
//RMVB视频文件（具体的实现化角色）
public class RMVBfile implements videoFile{

    @Override
    public void decode(String fileName) {
        System.out.println("RMVB实现视频文件："+ fileName);
    }
}
