package Chapter04;

public class report12 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66};
        /*
        1.先创建一个新的数组arr2，大小 arr.length
        2.逆序遍历 arr，将每个元素拷贝到arr2的元素中（顺序拷贝）
        3.建议增加一个循环变量 j ➡ 0 ➡ 5
         */
        int[] arr2 = new int[arr.length];
        //逆序遍历 arr
        for (int i = arr.length - 1 , j = 0; i  >= 0 ; i--, j++) {
            arr2[j] = arr[i];
        }
        //4.当for循环结束，arr2就是一个逆序数组{66，55，44，33，22，11}
        //5.让arr指向arr2数据空间，此时arr原来的数据空间就没有变量引用，会被当作垃圾，销毁
        arr = arr2;
        System.out.println("===arr元素情况===");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");

        }
    }
}
