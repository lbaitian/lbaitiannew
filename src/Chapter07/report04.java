package Chapter07;

import java.util.Random;

import static casejava.report1.createCode;

public class report04 {
    public static void main(String[] args) {
        System.out.println(createCode(4));
        System.out.println(createCode(6));
    }
        //需求：随机产生验证码，验证码的每一位可能是数字，大写字母，小写字母
        /*
        1.设计一个方法，该方法接受一个整型参数，最终要返回对应位的随机验证码
        2.方法内定义两个字符串变量：1个用来记住生成的验证码，一个用来记住要用到的全部字符
        3.定义for循环控制生成多少位随机字符，每次得到一个字符范围内的随机索引，根据索引提取该字符，把该字符交给code变量连接起来，循环结束后，在循环外返回code即可
        4.主程序中，调用该方法即可得到随机验证码
         */
        //1.设计一个方法，返回指定位数的验证码
    public static String createCode(int n){  //调用createCode方法实现了随机生成验证码的功能
        //这是一个名为createCode的方法，它接受一个整数参数n，表示生成验证码的位数，然后返回生成的验证码字符串
        //2.定义两个变量 一个记住最终产生的随机验证码  一个是记住可能用到的全部字符
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

        Random r = new Random();
        //3.开始定义一个循环产生每位随机字符
            for (int i = 0; i < n; i++) {
                //4.随机一个字符范围内的索引
                int index = r.nextInt(data.length());
                //5.根据索引去全部字符中提取该字符
                code += data.charAt(index);//code = code + 字符
                //在循环中，程序随机生成一个字符的索引，然后从data中提取该字符，并将其连接到code变量上。这个过程重复n次，生成指定位数的验证码

            }
            //6.返回code即可
            return code;
        }
    }

