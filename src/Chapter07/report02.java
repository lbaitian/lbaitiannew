package Chapter07;

import java.util.SplittableRandom;

public class report02 {
    public static void main(String[] args) {
        //熟悉String提供的处理字符串的常用方式
        String s = "李拜天java";
        //1.提供字符串的长度
        System.out.println(s.length());

        //2.提供字符串中某个索引位置处的字符
        char c = s.charAt(1);
        System.out.println(c);

        //字符串的遍历
        for (int i = 0; i < s.length(); i++) {
            // i = 1 2 3 4 5
            char ch = s.charAt(i);
            System.out.println(ch);

        }
        System.out.println("------------------------");
        //3.把字符串转换成字符数组，在进行遍历
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println("------------------------");
        //4.判断字符串内容，内容一样就返回true
        String s1 = new String("liran");
        String s2 = new String("李姌");
        System.out.println(s1 == s2);//flase
        System.out.println(s1.equals(s2));
        System.out.println("------------------------");

        //5.忽略大小写比较字符串内容(忽略大小写)
        String c1 = "34AeFG";
        String c2 = "34aEfg";
        System.out.println(c1.equals(c2));//flase
        System.out.println(c1.equalsIgnoreCase(c2));//true
        System.out.println("------------------------");

        //6.截取字符串内容，得到新的字符串(包前不包后)
        String s3 = "java是最好的编程语言";
        String rs = s3.substring(0, 8);
        System.out.println(rs);
        System.out.println("------------------------");

        //7.从当前索引位置一直截取到字符串的末尾
        String rs2 = s3.substring(5);
        System.out.println(rs2);
        System.out.println("------------------------");

        //8.把字符串中的某个内容替换成新内容，并返回新的字符串对象给我们
        String info = "这个电影很垃圾，垃圾电影";
        String rs3 = info.replace("垃圾","**");
        System.out.println(rs3);
        System.out.println("------------------------");

        //9.判断字符串是否包含某个关键字
        String info2 = "java是最好的编程语言";
        System.out.println(info2.contains("Java"));
        System.out.println(info2.contains("java"));
        System.out.println(info2.contains("java2"));
        System.out.println("------------------------");

        //10.判断字符串是否以某个字符串开头
        String rs4 = "李拜天";
        System.out.println(rs4.startsWith("李"));
        System.out.println(rs4.startsWith("李拜"));
        System.out.println(rs4.startsWith("李拜2"));
        System.out.println("------------------------");

        //11.把字符串按照某个指定内容分割成多个字符串，放到一个字符串数组中返回给我们
        String rs5 = "李拜天, 狗比乐乐, 猪头佳哥, 妞";
        String[] names = rs5.split(",");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
