package casejava;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class report06 {
    public static void main(String[] args) {
        /*
        需求：抢红包活动，分别有：9、666、188、520、99999五个红包。
        请模拟粉丝来抽奖，按照先来先得，随机抽取，抽完即止，注意：一个红包只能被抽一次，先抽或后抽哪一个红包是随机的，示例如下（不一定是下面的顺序）：
        分析：
            1. 方法是否需要接收数据进行处理？需要接收一个数组，里面是5个金额，表示5个红包
            2． 方法是否需要返回数据？不需要
            3. 方法内部完成本需求的第1种方案：写个for循环控制抽奖5次，每次抽奖，
                都从数组中随机找出一个金额，如果该金额不是0，则代表抽中，接着用0替换该位置处的金额，
                然后继续下一个粉丝的抽奖；如果抽中的金额发现是0，代表该位置处的红包之前被别人抽走了，
                则从新从数组中随机找出一个金额，继续判断！直至抽中的金额不是0！
         */
        int[] moneys = {9, 666, 188, 520, 99999};
        start(moneys);

    }

    public static void start(int[] moneys) {
        //moneys = [9, 666, 188, 520, 99999]
        //          0   1    2    3    4
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        //1.定义一个for循环，控制抽奖5次
        for (int i = 1; i <= 5; i++) {
            //提示粉丝抽奖
            System.out.println("请您输入任意内容进行抽奖：");
            sc.next();//等待用户输入内容，按回车才继续往下走

            //3.为当前这个粉丝找一个随机红包出来
            while (true) {
                int index = r.nextInt(moneys.length);//0-4
                int money = moneys[index];

                //4.判断这个红包是否不为0
                if (money != 0) {
                    System.out.println("恭喜你，抽中了红包：" + money);
                    moneys[index] = 0;
                    break;//结束这次抽奖
                }

            }
        }
        System.out.println("活动结束...");
    }
}

