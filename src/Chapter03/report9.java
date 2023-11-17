package Chapter03;
import java.util.Random;
import java.util.Scanner;
public class report9 {
    public static void main(String[] args) {
        //猜数字游戏
        //随机生成1-100的数据，提示用户猜测，猜大提示用户猜大，猜小提示用户猜小。直到猜中游戏结束
        /*
        分析：1.需要随机生成1-100的数据
        2.需要定义一个死循环让用户一直猜
        3.在死循环里，每次提醒用户输入一个数据。提示猜大过大，猜小过小。猜中游戏结束
         */
        Random r = new Random();
        int lucknumber = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        //Scanner）是java.util包中的一个类，用于读取用户输入或者从文件等数据源中获取数据
        //sc.nextInt() 是使用 Scanner 类的实例（在这里，sc 是 Scanner 的实例）从输入中读取一个整数的方法
        //System.in 表示标准输入流，通常是键盘输入。通过将其传递给 Scanner 构造函数，你可以使用 Scanner 对象来从键盘读取用户输入的信息，如整数、字符串等
        while (true){
            System.out.println("输入你猜测的数据：");
            int guessnumber = sc.nextInt();

            if (guessnumber > lucknumber){
                System.out.println("过大了");
            } else if (guessnumber < lucknumber) {
                System.out.println("过小了");
            }else {
                System.out.println("恭喜你猜对了");
                break;//结束死循环
            }
        }
    }
}
