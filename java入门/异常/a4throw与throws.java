package 异常;

public class a4throw与throws {
    public static void main(String[] args) {
        /**
         *   throws：写在方法定义处，表示声明一个异常。告诉调用者，使用本方法可能会有哪些异常。
         *   throw ：写在方法内，结束方法。手动抛出异常对象，交给调用者。方法中下面的代码不再执行了。
         */
        getSum(new int[]{1,2,3});

    }
    //编译时异常 可以省略
    public static void getSum(int arr[])throws NullPointerException,ArrayIndexOutOfBoundsException{
        //手动创建一个异常对象，并把这个异常交给方法的调用者处理
        //此时方法就会结束，下面的代码不会再执行了
        if (arr==null){
            throw new NullPointerException("抛出空指针异常");
        }
        if (arr.length==0){
            throw new ArrayIndexOutOfBoundsException("抛出数组越界异常");
        }
        //自定义的异常并抛出
        if (arr[0]==1){
            throw new RuntimeException("特殊规则 第一项不能为1");
        }
        int sum=0;
        for (int i : arr) {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
