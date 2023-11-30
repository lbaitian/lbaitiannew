package casejava;

public class report11 {
    public static void main(String[] args) {
        //打印乘法口诀表
        //1.定义一个for循环控制打印多少行
        for (int i = 1; i <= 9 ; i++) {
            //i = 1 2 3 4 5 6 7 8 9
            //2.定义一个内部循环控制每行打印多少列
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + "X" + i + "=" + (j * i) + "\t");

            }
            System.out.println();//换行
        }
    }
}
