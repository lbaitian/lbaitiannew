package Chapter03;

public class report {
    public static void main(String[] args) {
        //定义一个变量用于求和
        int sum = 0;
        for (int i = 1; i <= 5 ; i++) {
            sum = sum + i;

        }
        System.out.println("1-5的整数和:" + sum);
        System.out.println("---------------------------");

        int sum1 = 0;
        for (int i = 0; i <= 100 ; i++) {
            //i = 1 2 3 4 5....
            sum1 += i;// sum = sum + i;
        }
        System.out.println("1-100的和：" + sum1);
        System.out.println("-------------------");

        int sum2 = 0;
        for (int i = 1; i <= 100 ; i++) {
            //i = 1 2 3 4 5 6 7....99 100
            //使用if分支，判断i此时记住的数据是否是奇数，是奇数就累加一个变量
            if (i % 2 == 1){
                //i = 1 3 5 7 9.....99
                sum2 += i;
            }

        }
        System.out.println("1-100的奇数和：" + sum2);
        System.out.println("---------------------------------");

        int sum3 = 0;
        for (int i = 1; i <= 100 ; i+= 2) {
            // i = 1 3 5 7 9.....
            sum3 += i;

        }
        System.out.println("1-100的奇数和：" + sum3);
    }
}
