package Chapter02;

import java.util.Scanner;

public class report1 {
    public static void main(String[] args) {
        //if分支的三种流程方法
        //需求：提问大于37°就报警
        double t = 38.9;
        if (t > 37);
        System.out.println("异常");
        System.out.println("------------------------------");
        //编写一个程序，可以输入人的年龄，如果大于18.则输出“你的年龄大于18，要对自己负责”
        /*
        分析：
        1.先接受输入的年龄。应该定义一个Scanner对象
        2.把年龄保存到一个变量 int age
        3.使用if判断，输出对应信息
         */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("输入年龄：");
        int age = myScanner.nextInt();
        if (age > 18){
            System.out.println("你的年龄大于18，要对自己负责");
        }
        System.out.println("程序结束");
    }
}
