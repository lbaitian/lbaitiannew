package Chapter06;

public class report05 {
    public static void main(String[] args) {
        //输出一个int类型的数组内容，要求输出格式为：【11，22，33，44，55】
        /*
        分析：
        1.方法书否需要接收数据处理：需要接收一个int类型的数组，因此形参声明为：int【】arr
        2.方法是否需要返回数据：方法内部直接输出数组内容即可，无需返回，因此返回值类型声明为：void
         */
        int[] arr = {11,22,33,44,55};
        printArray(arr);
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        //直接遍历接到的数组元素
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ",");
            }
            //优化代码：System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.println("]");
    }

}
