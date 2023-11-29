package casejava;

public class report08 {
    public static void main(String[] args) {
        //判断101-200之间有多少个素数，并输出所有素数
        //素数：除了一和本身之外，不能被其他正整数整除，就叫素数
        //分析：1.方法是否需要接收数据进行处理？需要接受101以及200，以便找该区间中的素数
        //2.方法是否需要返回数据？需要返回找到的素数个数
        //3.方法内部实现逻辑：使用for循环来产生如101到200之间的每个数；每拿到一个数，判断该数是否是素数；
        // 判断规则是：从2开始遍历到该数的一半的数据，看是否有数据可以整除它，有则不是素数，没有则是素数；
        // 根据判定的结果来决定是否输出这个数据（是素数则输出）；最后还需要统计素数的个数并返回。
        System.out.println("当前素数的个数是：" + search(101, 200));
    }
    public static int search(int start,int end){
        int count = 0;
        //start = 101     end = 200
        //1.定义一个for循环找到101-200之间的每个数据
        for (int i = start; i <= end ; i++) {
            // i = 101  102  103 ... 199 200
            //信号位思想
            boolean flag = true;//假设的意思，默认认为当前i记住的数据是素数

            //2.判断当前i，记住的这个数据是否是素数
            for (int j = 2; j <= i / 2 ; j++) {
                if (i % j == 0){
                    //1.当前记住的这个数据不是素数了
                    flag = false;
                    break;
                }

            }
            //3.根据判定的结果决定是否输出i当前记住的数据：是素数才输出展示
            if (flag){
                System.out.println(i);
                count++;
            }

        }
        return count;
    }
}
