package casejava;

import java.util.Scanner;

public class report12 {
    public static void main(String[] args) {
        //目标：完成双色球系统开发
        int[] userNumbers = userSelectNumbers();
        printArray(userNumbers);
    }

    public static void  printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - i ? arr[i] : arr[i] + ",");

        }
        System.out.println("]");

    }
    //1.设计一个方法，用于让用户投注一组号码并返回（前6个是红球号码，最后一个是蓝色号码）
    public static int[] userSelectNumbers() {
        //2.创建一个整型数组，用于存储用户投注的7个号码（前6个红球号码，最后一个篮球号码）
        int[] numbers = new int[7];
        //numbers = 【0，0，0，0，0，0，0】
        //           0  1  2  3  4  5 6

        //3.遍历前6个位置，让用户依次投注6个红球号码，存入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            //i = 0 1 2 3 4 5

            while (true) {
                //4.开始让用户为当前位置投注一个红色号码（1-33之间，不能重复）
                System.out.println("请您输入第" + (i + 1) + "个红球号码（1-33之间，不能重复）：");
                int number = sc.nextInt();

                //5.先判断用户输入的红球号码是否在1-33之间
                if (number < 1 || number > 33) {
                    System.out.println("对不起，您输入的号码不在1-33之间，请确认！");
                } else {
                    if (exist(numbers, number)) {
                        System.out.println("对不起，您输入的红球号码前面选择过了，重复了，请确认！");
                    } else {
                        numbers[i] = number;
                        break;
                    }
                }
            }
        }
        //6.投注最后一个篮球号码
        while (true) {
            System.out.println("请您输入最后一个篮球号码（1-16）：");
            int number = sc.nextInt();
            if (number < 1 || number > 16) {
                System.out.println("对不起，您输入的篮球号码范围不对！");
            } else {
                numbers[6] = number;
                break;
            }
        }
        return numbers;
    }

    private static boolean exist(int[] numbers, int number) {
        //判断number这个数字是否存在numbers数组中存在
        //numbers = 【12，25，18，0，0，0，0】
        //number = 26
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number){
                return true;
            }

        }
        return false;
    }

}

