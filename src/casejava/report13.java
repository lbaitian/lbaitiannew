package casejava;

import java.util.Random;

import static casejava.report12.*;

public class report13 {
    public static void main(String[] args) {
        //完成双色球系统开发
        int[] userNumbers = userSelectNumbers();
        printArray(userNumbers);

        int[] luckNumbers = createLuckNumber();
        printArray(luckNumbers);
    }
    //1.设计一个用法，用于让用户投注一组号码并返回（前6个红球号码，最后一个蓝球号码）
    //public static int[] userSelectNumbers(){}

    //private static boolean exist(int[] numbers, int number){...}

    //public static void printArray(int[] arr){...}

    //2.设计一个方法：随机一组中奖号码出来（6个红球号码，1个蓝球号码）
    public static int[] createLuckNumber(){
        //1.创建一个整型数组，用于存储这7个号码
        int[] numbers = new int[7];

        Random r = new Random();
        //2.遍历前6个位置处，依次随机一个红球号码存入（1-33 不重复)
        for (int i = 0; i < numbers.length; i++) {
            //i =0 1 2 3 4 5

            while (true){
                //3.为当前这个位置随机一个红球号码出来存入。 1-33 ==> -1 ===> (0 , 32) + 1
                int number= r.nextInt(33)+1;

                //4.判断这个号码是否之前出现过（红球号码不能重复）
                if(!exist(numbers, number)){
                    //number不重复
                    numbers[i] = number;
                    break;//结束死循环，代表找到了当前这个位置的一个不重复的红球号码
                }
            }

        }
        //3.录入一个蓝球号码。1-16
        numbers[6] = r.nextInt(16)+1;
        return numbers;
    }
}
