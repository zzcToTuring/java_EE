package 异常;
/**
 * 定义一个累加的方法 除了基本的操作外，还有一些其他的方式
 * 使用自定义异常类，主要的目的就是让用户见名知意 方便用户进行操作(理解)
 */
public class a5自定义异常类 {
    public static void main(String[] args) {
        getSum(new int[]{1,2,3,4});
    }
    public static void getSum(int[] arr){
        if (arr==null){
            throw new NullPointerException("抛出空指针异常");
        }
        if (arr.length==0){
            throw new ArrayIndexOutOfBoundsException("抛出数组越界异常");
        }
        //自定义的异常并抛出
        if (arr[0]==1){
            throw new ArrayDidException();
        }
        int sum=0;
        for (int i : arr) {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
class ArrayDidException extends RuntimeException{
    public ArrayDidException() {
        super("自己定义的规则");
    }
    public ArrayDidException(String message) {
        super(message);
    }
}
