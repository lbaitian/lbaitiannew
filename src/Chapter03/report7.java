package Chapter03;

public class report7 {
    public static void main(String[] args) {
        //循环结构的跳转关键字：break和continue
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("li" + i);
            if(i == 3){
                //只需要输出到第三句
                break;//跳转并结束当前所在循环的执行
            }
        }
        System.out.println("----------------------------------");
        for (int i = 1; i <= 5; i++) {
            if (i == 3){
                //第三次不输出
                continue;
            }
            System.out.println("Q1" + i);
        }
    }
}
