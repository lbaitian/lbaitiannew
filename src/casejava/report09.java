package casejava;

public class report09 {
    public static void main(String[] args) {
        int count = 0;
        OUT://为外部循环指定标签
        for (int i = 101; i <= 200 ; i++) {
            for (int j = 2; j <= i / 2 ; j++) {
                if (i % j == 0){
                    continue OUT;//结束外部循环的当次执行

                }

            }
            count++;
            System.out.println(i);

        }
        System.out.println("个数是：" + count);
    }
}
