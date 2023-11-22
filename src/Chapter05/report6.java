package Chapter05;

public class report6 {
    public static void main(String[] args) {
        //用二维数组打印10行杨辉三角
        /*
        1
        1 1
        1 2 1
        1 3 3 1
        1 4 6 4 1
        1 5 10 10 5 1
        ......

        思路：
        第一行有一个元素，第n行有n个元素
        每一行的第一个元素和最后一个元素都是1
        从第三行开始，对于非第一个元素和最后一个元素的元素值. arr[i][j]
        arr【i】【j】 = arr【i - 1】【j】 + arr【i -1】【j - 1】//必须找到这个规律
         */
        int[][] yanghui = new int[10][];
        for (int i = 0; i < yanghui.length; i++) {  //遍历yanghui的每个元素
            //给每个一维数组开空间
            yanghui[i] = new int[i+1];
            //给每一个一维数组赋值
            for (int j = 0; j < yanghui[i].length; j++) {
                //每一行的第一个元素和最后一行的元素都是1
                if (j == 0 || j ==yanghui[i].length - 1){
                    yanghui[i][j] = 1;
                } else { //中间的元素
                    yanghui[i][j] = yanghui[i-1][j] + yanghui[i-1][j-1];
                }

            }

        }
        //输出杨辉三角
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j]);

            }
            System.out.println();

        }
    }
}
