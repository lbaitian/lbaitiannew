package Chapter06;

public class report08 {
    public static void main(String[] args) {
        //return关键字
        System.out.println("开始");
        chu(10 , 2);
        System.out.println("结束");
    }
    public static void chu(int a, int b){
        if(b == 0){
            System.out.println("您的数据有问题！！不能执行！！");
            return;
        }
        int c = a / b;
        System.out.println("除法结果是：" + c);
    }
}
