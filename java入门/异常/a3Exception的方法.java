package 异常;

public class a3Exception的方法 {
    public static void main(String[] args) {
        /**
         *    public String getMessage()          返回此 throwable 的详细消息字符串
         *    public String toString()            返回此可抛出的简短描述
         *    public void printStackTrace()       在底层是利用System.err.println进行输出,把异常的错误信息以红色字体输出在控制  细节：仅仅是打印信息，不会停止程序运行
         */
        int arr[]={1,2,3,4};
        try {
            System.out.println(arr[5]);
        }catch (Exception e){
            System.out.println("getMessage: "+e.getMessage());
            System.out.println("toString:  "+e.toString());
            e.printStackTrace();//多线程
            System.out.println("仅仅是红色打印 还是会执行后面的代码");
        }
        System.out.println("try之后的代码");
    }
}
