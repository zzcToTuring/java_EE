public class demo05_手写冒泡排序 {
    public static void main(String[] args) {
        //随机生成数组
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=(int)(Math.random()*100);
        }
        //开始冒泡排序
        /*
        * 主要是两个数据交换，多次循环遍历，以达到排序的目的
        * 冒泡排序需要进行n次循环，每次循环后，会把最大的放在后，
        * 在每次循环的时候会进行遍历，遍历的次数随着循环的次数减少而减少(因为最大的已经放到最后去了，遍历的次数减少)
        * 在遍历的时候进行比较，要是左边比右边大交换数据
        * 直到循环且遍历完成
        *
        * */
        //循环数组
        for (int i = 0; i < arr.length; i++) {
            //循环过程中的遍历
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        //最后结果的展示
        for (int test:arr) {
            System.out.print(test+"   ");
        }
    }
}
