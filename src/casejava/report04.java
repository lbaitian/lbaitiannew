package casejava;

public class report04 {
    public static void main(String[] args) {
        //完成数字加密程序的开发
        /*需求：某系统的数字密码是一个四位数，如1983，为了安全，需要加密后再传输，
        加密规则是：对密码中的每位数，都加5，再对10求余，最后将所有数字顺序反转，得到一串加密后的新数，请设计出满足本需求的加密程序！
        分析：
        1．方法是否需要接收数据进行处理？需要接收四位数字密码，进行加密处理。
        2．方法是否需要返回数据？需要返回加密后的结果。
        3.方法内部的业务：将四位数字密码拆分成一个一个的数字，存入到数组中去，遍历数组中的每个数字，按照题目需求进行加密！最后，再把加密后的数字拼接起来返回即可！
         */
        System.out.println("加密后的结果是：" + encrypt(1983));

    }
    public static String encrypt(int number){
        //number = 1983
        //1.把这个密码拆分成一个一个的数字，才可以对其进行加密
        int[] numbers = split(number);
        //number = [1, 9, 8, 3]
        //2.遍历这个数组中的每个数字，对其进行加密处理
        for (int i = 0; i < numbers.length; i++) {
            //i = 0 1 2 3
            numbers[i] = (numbers[i] + 5) % 10;

        }
        //numbers = [6, 4, 3, 8]
        //3.对数组反转，把对数组进行反转的操作交给一个独立的方法来完成
        reverse(numbers);
        //numbers = [8, 3, 4, 6]

        //4.把这些加密的数字拼接起来作为加密后的结果返回即可
        String data = "";
        for (int i = 0; i < numbers.length; i++) {
            data += numbers[i];
        }
        return data;
    }

    private static void reverse(int[] numbers) {
        //反转数组的
        //number = [6, 4, 3, 8]
        for (int i = 0, j = numbers.length - 1; i < j; i++,j--) {
            //交换i和j的位置处的值
            //1.把后一个位置处的值交给一个临时变量先存起来
            int temp = numbers[j];
            //2.把前一个位置处的值赋值给后一个位置处
            numbers[j] = numbers[i];
            //3.把后一个位置处原来的值（由临时变量记住着）赋值给前一个位置
            numbers[i] = temp;

        }
    }

    public static int[] split(int number) {
        // number = 1983
        int[] numbers = new int[4];
        numbers[0] = number / 1000;
        numbers[1] = (number / 100) % 10;
        numbers[2] = (number / 10) % 10;
        numbers[3] = number % 10;
        return numbers;


    }
}
