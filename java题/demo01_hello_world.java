public class demo01_hello_world {
    public static void main(String[] args) {
        int a = 0;
        while (a < 6) {
            System.out.println("hello world");
            show();
            a++;
        }
    }
    private static void show() {
        System.out.println("show 断点");
        System.out.println("输出1");
        System.out.println("输出2");
    }
}
