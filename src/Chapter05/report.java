package Chapter05;

public class report {
    public static void main(String[] args) {
        //二维数组
        /*
        1.语法：类型【】【】 数组名= new 类型【大小】【大小】
        2.比如：int a【】【】= new int【2】【3】
         */
        int[][] arr = { {0, 0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 0, 0},
                        {0, 2, 0, 3, 0, 0},
                        {0, 0, 0, 0, 0, 0}};
        //输出二位图形
        for (int i = 0; i < arr.length; i++) {
            //遍历二维数组的每个元素
            //1.arr【i】 表示 二维数组的第i+1个元素  比如arr【0】：二维数组的第一个元素
            //2.arr【i】.length 得到对应的 每个一维数组的长度
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);//输出一维数组


            }
            System.out.println();//换行

        }
    }
}
