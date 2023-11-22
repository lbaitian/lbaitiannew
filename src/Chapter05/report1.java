package Chapter05;

public class report1 {
    public static void main(String[] args) {
        //冒泡排序
        /*
        1.一共有5个元素
        2.一共进行4轮排序，可以看成时外层循环
        3.每一轮排序可以确定一个数的位置，比如第一轮排序确定最大数，第二轮排序确定第二大的数
        4.当进行比较时，如果前面的数大于后面的数，就交换
         */
        int[] arr = {24, 69, 80, 57, 13};
        int temp = 0; //用于辅助交换的变量
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {  //4次比较
                //如果前面的数大于后面的数就交换
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
            System.out.println("===第" + (i + 1) + "轮===");
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j]);

            }
        }
    }
}
