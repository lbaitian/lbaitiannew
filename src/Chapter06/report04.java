package Chapter06;

public class report04 {
    public static void main(String[] args) {
        //需求：计算1-n的和
        /*
        分析：
        1.方法是否需要接受数据进行处理：需要接受n具体的值，因此形参声明为：int n
        2.方法是否需要返回数据：需要返回1-n的求和结果，因此返回值声明类型为int
         */

        /*
        //判断一个整数是奇数还是偶数，并输出判断的结果。
        /*
        分析：
        1.方法是否要接收数据进行处理：需要接受一个整数来判断，因此形参声明为：int number
        2.方法是否需要返回数据：方法内部判断完后直接输出结果即可，无需返回，因此返回值类型声明为：void
         */
        int rs = add(5);
        System.out.println("1-5的和是：" + rs);
        int rs1 = add(100);
        System.out.println("1-100的和是：" + rs1);
        System.out.println("--------------------------------------");
        ds(10);
        ds(7);
    }
    public static void ds(int number){
        if(number % 2 == 0){
            System.out.println(number + "是一个偶数！");
        }else {
            System.out.println(number + "是一个奇数！");
        }
    }
    public static int add(int n){
        int sum = 0;
        for (int i = 0; i <= n ; i++) {
            sum += i;

        }
        return sum;
    }
}
