package Chapter04;

import java.util.Random;

public class report {
    public static void main(String[] args) {
        //数组和变量的比较
        //制作一个随机点名的程序
        //使用变量来完成：
        /*String name1 = "张三";
        String name2 = "李四";
        String name3 = "王五";
        String name4 = "周六";
        Random r = new Random();
        int number = r.nextInt(5) + 1;
        switch (number){
            case 1:
                System.out.println(name1 + "出来回答问题");
                break;
            case 2:
                System.out.println(name2 + "出来回答问题");
                break;
            case 3:
                System.out.println(name3 + "出来回答问题");
                break;
            case 4:
                System.out.println(name4 + "出来回答问题");
                break;
        }*/
        //使用数组来解决
        String[] names = {"张三","李四","王五","周六"};
        Random a = new Random();
        int i = a.nextInt(5) + 1;
        System.out.println(names[i] + "出来回答问题");
    }
}
