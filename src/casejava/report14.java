package casejava;

import static casejava.report12.printArray;
import static casejava.report12.userSelectNumbers;
import static casejava.report13.createLuckNumber;

public class report14 {
    public static void main(String[] args) {
        //完成双色球系统开发
        int[] userNumbers = userSelectNumbers();
        System.out.println("您投注的号码：");
        printArray(userNumbers);

        int[] luckNumbers = createLuckNumber();
        System.out.println("中奖号码：");
        printArray(luckNumbers);

        judge(userNumbers, luckNumbers);
    }

    //1.设计一组方法，用于让用户投注一组号码并返回（前6个是红球号码，最后一个是蓝球号码）
    //public static int[] userSelectNumbers(){...}

    //private static boolean exist(int[] numbers, int number){...}

    //public static void printArray(int[] arr){...}

    //2.设计一个方法：随机一组中奖号码出来（6个红球号码，一个篮球号码）
    //public static int[] createLuckNumber(){...}

    //3.设计一个方法，用于判断用户的中将情况
    public static void judge(int[] userNumbers,int[] luckNumber){
        //userNumber = [12, 14, 16, 18, u23, 26, 8]
        //luckNumber = [16, 17, 18, 19, 26, 32, 8]

        //2.分别定义两个变量用于记住红球命中了几个以及蓝球命中了几个
        int redCount = 0;
        int blueCount = 0;

        //先判断红球命中数量
        //遍历用户投注的号码的前6个红球
        for (int i = 0; i < userNumbers.length ; i++) {
            //userNumber[i]
            //开始遍历中h奖号码的前6个红球号码，看用户当前选择的这个号码是否命中了
            for (int j = 0; j < luckNumber.length - 1; j++) {
                if (userNumbers[i] == luckNumber[i]){
                    redCount++;
                    break;
                }

            }

        }
        //3.判断蓝球是否命中
        blueCount = userNumbers[6] == luckNumber[6] ? 1 : 0;
        System.out.println("您命中的红球数量是：" + redCount);
        System.out.println("您命中的蓝球数量是：" + blueCount);

        //4.判断中奖情况输出结果
        if(redCount == 6 && blueCount == 1){
            System.out.println("恭喜中奖1000万！！");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜中奖500万！！");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("中奖3000元");
        } else if (redCount == 5 && blueCount == 0) {
            System.out.println("中奖200元");
        } else if (redCount == 4 && blueCount == 0) {
            System.out.println("中奖10元");
        } else if (redCount < 3 && blueCount == 1) {
            System.out.println("中奖5元");
        }else {
            System.out.println("谢谢您的参与！！！");
        }
    }

}
