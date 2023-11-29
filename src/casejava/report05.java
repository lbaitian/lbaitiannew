package casejava;

import static Chapter06.report05.printArray;

public class report05 {
    public static void main(String[] args) {
        //需求：把一个整型数组，例如存了数据：11，22，33，拷贝成一个一模一样的新数组出来。
        /*
        分析：
        1.方法是否需要接收数据进行处理？需要接收一个整型数组（原数组）
        2.方法是否需要返回数据？需要返回一个新的、一模一样的整型数组。
        3.方法内部的业务：创建一个长度一样的整型数组做为新数组，并把原数组的元素对应位置赋值给新数组，最终返回新数组即可。
         */
        int[] arr = {11, 22, 33};
        int[] arr2 = copy(arr);
        printArray(arr2);
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.print("]");
    }

    private static int[] copy(int[] arr) {
        //arr = [11, 22, 33]
        //       0   1    2
        //1.创建一个长度一样的整型数组出来
        int[] arr2 = new int[arr.length];
        //arr = [0, 0, 0]
        //       0  1  2
        //2.把原数组的元素值对应位置赋值给新数组
        for (int i = 0; i < arr.length; i++) {
            //i = 0 1 2
            arr2[i] = arr[i];

        }
        return arr2;
    }

}
