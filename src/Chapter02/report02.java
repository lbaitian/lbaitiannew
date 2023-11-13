package Chapter02;

public class report02 {
    public static void main(String[] args) {
        // 需求：发红包。你的钱包余额是99元，现在要发90元
        // 如果钱够，就触发发红包；钱不够就提示余额不足
        double money = 99;
        if (money >= 90) {
            System.out.println("成功");
        } else {
            System.out.println("余额不足");
        }
        System.out.println("----------------------------------------------");
        //需求3：绩效考核，【0，60）D；【60，80）C；【80，90）B，【90，100】A；
        int a = 78;
        if (a >= 0 && a < 60) {
            System.out.println("你的绩效成绩是：D");
        }else if (a >= 60 && a < 80) {
            System.out.println("你的绩效成绩是：C");
        }else if (a >= 80 && a < 90) {
            System.out.println("你的绩效成绩是：B");
        }else if (a >= 90 && a <= 100) {
            System.out.println("你的绩效成绩是：A");
        }else {
                System.out.println("您录入的分数有问题");
                    }
                }
            }


