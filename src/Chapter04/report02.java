package Chapter04;

import jdk.swing.interop.SwingInterOpUtils;

public class report02 {
    public static void main(String[] args) {
        //数组的访问
        int[] arr ={12,24,36};
                  // 0  1  2
        //访问数组的全部数据
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("-------------------------------");

        //修改数组中的数据
        arr[0] = 88;
        arr[1] = 100;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("-------------------------------");

        //访问数组的元素个数：数组名.length
        System.out.println(arr.length);
        System.out.println("-------------------------------");

        //获取数组的最大索引方式：arr.length - 1
        System.out.println(arr.length - 1);

        int[] arr2 = {};
        System.out.println(arr2.length - 1);
    }
}
