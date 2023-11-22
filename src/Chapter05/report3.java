package Chapter05;

public class report3 {
    public static void main(String[] args) {
        /*
        1.语法：类型【】【】 数组名= new 类型【大小】【大小】
        2.比如：int a【】【】= new int【2】【3】
         */
        int arr[][] = new int[2][3];
        //遍历arr数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);

            }
            System.out.println();//换行
        }
    }
}
