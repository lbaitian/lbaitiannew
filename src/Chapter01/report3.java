package Chapter01;

public class report3 {
    public static void main(String[] args) {
        int i = 1;
        i = i++;//计算机使用临时变量：1：假设变量是X，则X=1；2：i=i+1;3:i=X;
        System.out.println(i);
        System.out.println("-------------------");
        int a = 1;
        a = ++a;//先a++=2;计算机的临时变量：X；X→a；
        System.out.println(a);
        System.out.println("-------------------------------");
        int a1 = 10;
        int a2 = 20;
        int b = a1++;
        System.out.println("b="+b);
        System.out.println("a2="+a2);
        b = --a2;
        System.out.println("b="+b);
        System.out.println("a2="+a2);
        System.out.println("----------------------------");
        //假设还有49天圣诞节，问：合多少个星期零多少天
        //分析：（1）使用int变量，days 保存天数
        //（2）一个星期7天，所以星期数：days / 7
        //（3）零多少天就是：days % 7
        //（4）输出就可以了
        int days = 49;
        int weeks = days / 7;
        int leftDays = days % 7;
        System.out.println(days + "\n" + weeks + "\n"+ leftDays);
        System.out.println("------------------------");
        //
        double huashi = 500.00;
        double sheshi = 5.0 / 9 * (huashi - 100);//注意：因为是double类型的数据，所以要使用小数位
        System.out.println("华氏温度" + huashi + "\n" + "对应的摄氏温度=" + sheshi);
        System.out.println("----------------------------");
        int c = 10;
        int d = 99;
        int result = c > d ? c++ : d--;
        System.out.println("result=" + result);

    }
}
