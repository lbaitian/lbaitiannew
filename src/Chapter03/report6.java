package Chapter03;

public class report6 {
    public static void main(String[] args) {
        //循环嵌套
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("li" + i);

            }
            System.out.println("------------------");

        }
        //打印“*”
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.println("*");
            }
            System.out.println();

        }
    }
}
