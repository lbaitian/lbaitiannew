package Chapter04;

import java.util.Scanner;

public class report06 {
    public static void main(String[] args) {
        //需求：某歌唱比赛，需要开发一个系统：可以录入6名评委的打分，录入完成后立即输出平均分作为选手得分
        /*
        分析：
        1.6位评委打分是后期录入的，一开始不知道具体的分数，因此定义一个动态初始化的数组存分数
        2.遍历数组中的每一个位置，每次提示用户录入一个评委的分数，并存入到数组对应的位置
        3.遍历数组中的每一个元素进行求和，最终算出平均分
         */
        double[] scores = new double[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            //i = 0 1 2 3 4 5
            System.out.println("请你输入当面第" + (i + 1) + "个评委的分数");
            double score = sc.nextDouble();
            scores[i] = score;
        }
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("选手最终得分是：" + sum / scores.length);
    }
}
