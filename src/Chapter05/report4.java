package Chapter05;

public class report4 {
    public static void main(String[] args) {
        /*
        1.先声明： 类型 数组名【】【】；
        2.再定义（开辟空间）数组名 = new 类型【大小】【大小】
        3.赋值（有默认值，比如int 类型的就是0）
         */
        int arr[][];//声明二维数组
        arr = new int[2][3];//再开空间
        arr[1][1] = 8;
        //遍历arr数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}