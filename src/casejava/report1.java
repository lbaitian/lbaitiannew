package casejava;

import java.util.Random;

public class report1 {
    public static void main(String[] args) {
        /*
        需求：开发一个程序，可以生成指定位数的验证码，每位可以是数字，大小写字母
        分析：1.方法是否需要接收数据：需要接收一个整数，控制生成验证码的位数
        2.方法是否需要返回数据：需要返回生成的验证码
        3.方法内部的业务：使用for循环一次生成每位随机字符，并使用一个String类的变量把每个字符连接起来，最后返回该变量即可。
         */
        System.out.println(createCode(5));
    }
    public static String createCode(int n){
        //定义一个for循环用于控制产生多少位随机字符
        Random r = new Random();
        //定义一个String类型的变量用于记住产生的每位随机字符
        String code = "";
        for (int i = 1; i <= n ; i++) {
            // i = 1 2 3 4 5
            //为每个位置产生一个随机字符：可能是数字大小写字母
            //思路：随机一个0 1 2 之间的数字出来，0代表随机一个数字字符，1 2 代表随机大写字母，小写字母
            int type = r.nextInt(3);// 0 1 2
            switch (type) {
                case 0:
                    //随机一个数字字符
                    code += r.nextInt(10);// 0——9 code = code + 8
                    break;
                case 1:
                    //随机一个大写字符 A 65  Z 65+25  （0 - 25） + 65
                    char ch1 = (char)(r.nextInt(26) + 65);
                    code += ch1;
                    break;
                case 2:
                    //随机一个小写字符 a 97  z 97+25  （0-25）+97
                    char ch2 = (char)(r.nextInt(26) + 97);
                    code += ch2;
                    break;
            }

        }
        return code;
    }
}
