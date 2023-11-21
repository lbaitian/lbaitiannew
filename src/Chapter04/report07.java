package Chapter04;

public class report07 {
    public static void main(String[] args) {
        //求最值
        //数组元素求最值
        int[] face = {15,9000,10000,20000,9500,-5};
                //     0   1    2     3    4    5
        int max = face[0];//定义一个变量用于记住最大值
        for (int i = 1; i < face.length; i++) {
            //从数组的第二个位置开始遍历
            if(face[i] > max){
                max = face[i];
            }

        }
        System.out.println("最大是：" + max);
        System.out.println("------------------------------------------------");

        //数组反转
        //需求：某个数组有5个数据：【10，20，30，40，50】反转后【50，40，30，20，10】
        //分析：数组的反转操作实际上就是依次前后交换数据即可
        int[] arr = {10,20,30,40,50};
        //           i           j
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            // arr[i]      arr[j]
            //交换
            //1.定义一个临时变量记住后一个位置数的值
            int temp = arr[j];
            //2.把前一个位置处的值赋值给后一个位置
            arr[j] = arr[i];
            //3.把临时变量中记住的后一个位置处的值赋值给前一个位置处
            arr[i] =temp;
        }
        //遍历数组中的每一个数据，看是否反转成功
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");//去掉println的”ln“是打印在一行

        }
    }
}
