package Chapter04;

import java.util.Random;
import java.util.Scanner;

public class report13 {
    public static void main(String[] args) {
        //目标：完成随机排名
        //1.定义一个动态初始化数组用于存储5名员工的工号
        int[] codes = new int[5];
        //【0， 0， 0， 0， 0】
        //  0  1   2   3  4
        //2.提示用户录入5名员工的工号
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < codes.length; i++) {
            // i = 0  1  2  3  4
            System.out.println("请您输入当前第" + (i + 1) + "个员工的工号：");
            int code = sc.nextInt();
            codes[i] = code;
        }
        //3.打乱数组中的元素顺序
        // 【12， 33， 54， 26， 8】
        // i         index
        Random r = new Random();
        for (int i = 0; i < codes.length; i++) {
            int index = r.nextInt(codes.length);// 0 - 4
            int temp = codes[index];
            codes[index] = codes[i];
            codes[i] = temp;
        }
        //4.遍历数组中的工号输出即可
        for (int i = 0; i < codes.length; i++) {
            System.out.println(codes[i]);

        }
    }
}
