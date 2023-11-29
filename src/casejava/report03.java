package casejava;

import java.util.Scanner;

public class report03 {
    public static void main(String[] args) {
        //需求：在唱歌比赛中，有多个评委打分，分数是【0-100】之间的整数。选手最后得分是去掉最高分，最低分后剩余分数的平均分。
        /*
        分析：1.方法是否需要接受数据进行处理：需要接受评委人数
        2.方法是否需要返回数据：需要返回计算出的选手最终得分
        3.方法内部的业务：定义数组，录入评委的分数存入到数组中，然后遍历数组中的分数，计算出总分，并找出最高分，最低分，最后按照这些数据算出最终得分返回即可
        */
        System.out.println("当前选手得分是：" + rs(6));
    }
    public static double rs(int number){
        //1.定义一个动态初始化数组，负责后期存入评委的打分
        int[] scores = new int[number]; // 6
        // scores = [0, 0, 0, 0, 0, 0, 0]

        //2.遍历每个数组的位置，依次录入评委的分数
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            //i = 0, 1, 2, 3, 4, 5
            System.out.println("请您录入第" + (i + 1) + "个评委的分数：");
            int score = sc.nextInt();
            scores[i] = score;

        }
        //3.从数组中计算出总分，找出最高分，最低分
        int sum = 0;//求总分用的变量
        int max = scores[0];//求最大值
        int min = scores[0];//求最小值

        //遍历数组找出这些数据
        for (int i = 0; i < scores.length; i++) {
            // i = 0 1 2 3 4 5
            int score = scores[i];
            //求和
            sum += score;
            //求最大值

        if(score > max){
            max = score;
        }
        //求最小值
        if(score < min){
            min = score;
        }
    }
        //计算出平均分并返回
    return 1.0 * (sum - min -max) / (number - 2);
}
}