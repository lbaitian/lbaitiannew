package Chapter01;

public class report06 {
    public static void main(String[] args) {
        System.out.println(1 >> 2);// 1/2/2=0
        System.out.println(1 << 2);// 1*2*2=4
        System.out.println(4 << 3);// 4*2*2*2=32
        System.out.println(15 >> 2);// 15/2/2=3
        System.out.println("-------------------------");
        System.out.println(-10.5%3);
        //a%b 当a是小数时，公式= a-(int)a/b*b
        //-10.5%3 = -10.5-(-10)/3*3=-10.5+9=-1.5
        //注意：有小数位的计算，得到的结果时近似值
        System.out.println("----------------------------------");
        int i = 66;
        System.out.println(++i+i);
        //先执行i=i+1→i=67，这个时候i已经等于67了，所以i+i=67+67=134
        //将String转换成double类型的语句；将char类型转换成String的语句
        String str = "18.8";//注意字符串要转成double
        double d1 = Double.parseDouble(str);

        char c1 = '李';
        String str2 = c1 + "";
    }
}
