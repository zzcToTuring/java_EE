package 异常;

public class a2try捕获异常 {
    public static void main(String[] args) {
        /**
         * 自己处理（捕获异常）
         *             格式：
         *                 try {
         *                    可能出现异常的代码;
         *                 } catch(异常类名 变量名) {
         *                    异常的处理代码;
         *                 }
         *              好处:可以让程序继续往下执行，不会停止
         *
         *  Q1：如果try中没有遇到问题，怎么执行？
         *  A1：会把try里面所有的代码全部执行完毕，不会执行catch里面的代码（只有异常才会执行catch中的代码）
         *
         *  Q2：如果try中可能会遇到多个问题，怎么执行？
         *  A2：会写多个catch与之对应（如果我们要捕获多个异常，这些异常中如果存在父子关系的话，那么父类一定要写在下面）
         *
         *  Q3：如果try中遇到的问题没有被捕获，怎么执行？
         *  A3：相当于try...catch的代码白写了，最终还是会交给虚拟机进行处理。
         *
         *  Q4: 如果try中遇到了问题，那么try下面的其他代码还会执行吗？
         *  A4： 下面的代码就不会执行了，直接跳转到对应的catch当中，执行catch里面的语句体，但是如果没有对应catch与之匹配，那么还是会交给虚拟机进行处理
         */
        int[] arr=new int[3];
        try {
            System.out.println(arr[4]);
            System.out.println(2/0);
            System.out.println("try中有异常异常后面的代码不会执行了");
            //jdk7以后支撑这样的写法，可以把多个异常进行同一样式的处理
        }catch (ArrayIndexOutOfBoundsException | NullPointerException e){
            System.out.println(e);
        }
        System.out.println("但是跳出之后的代码还是会执行");
    }
}
