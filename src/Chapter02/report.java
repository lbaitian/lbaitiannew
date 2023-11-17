package Chapter02;

public class report {
    public static void main(String[] args) {
        int x = 7;
        int y = 4;
        if (x > 5) {
            if (y > 5) {
                System.out.println(x + y);
            }
            System.out.println("社畜");
        } else
            System.out.println("x is" + x);
        System.out.println("--------------------------------------");

        /*
        需求：定义两个变量int，判断两者的和是否能被3又被5整除，打印提示信息
        分析：
        1.定义两个变量int num1,num2
        2.定义一个变量 int sum = num1 + num2;
        3.sum % 3,5 后 等于0，说明可以整除
        4.使用if-else来提示对应信息
         */
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        if (sum % 3 ==0 && sum % 5 == 0){
            System.out.println("和可以被3又可以被5整除");
        }else {
            System.out.println("和不能被3和5整除");
        }
        System.out.println("--------------------------------------------");

    }
}
