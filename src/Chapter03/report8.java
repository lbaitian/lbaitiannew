package Chapter03;
import java.util.Random;
public class report8 {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(10);
        System.out.println("随机生成：" + number);
        System.out.println("------------------------------------");

        //需求：生成0-10之间的随机数
        for (int i = 1; i <= 5; i++) {
            int data = r.nextInt(10) + 1;
            System.out.println(data);
        }
        System.out.println("-----------------------------------");

        //需求：生成3-17之间的随机数
        for (int i = 1; i <= 5; i++) {
            int data1 = r.nextInt(15) + 3;
            System.out.println(data1);
        }
    }

}
