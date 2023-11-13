package Chapter01;

import java.util.Scanner;

public class report4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//抄写代码
        //导包调用sc的功能，来接受用户键盘输入的功能
        System.out.println("输入你的年龄");
        int age = sc.nextInt();//执行到这，会等待用户输入，直到回车才会继续进行程序
        System.out.println("你的年龄是" + age);

        System.out.println("你的的名字");
        String name = sc.next();//执行到这，会等待用户输入，直到回车才会继续进行程序
        System.out.println(name + "欢迎你");
    }
}
