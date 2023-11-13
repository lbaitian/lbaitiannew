package Chapter03;

public class report1 {
    public static void main(String[] args) {
        //目标：for循环
        //需求：打印3行Helloword
        for(int i = 0; i < 3; i++){
            /*for循环的流程：
            首先执行初始化：int i = 0；
            i= 0，判断循环条件 0 < 3,返回true，计算机会进入循环执行第一行Helloword，接着执行迭代语句i++
            i= 1，判断循环条件 1 < 3,返回true，计算机会进入循环执行第二行Helloword，接着执行迭代语句i++
            i= 2，判断循环条件 2 < 3,返回true，计算机会进入循环执行第三行Helloword，接着执行迭代语句i++
            i= 3，判断循环条件 3 < 3，返回false，计算机停止运行。
            * */
            //i = 0 1 2
            System.out.println("Helloword");
        }
        System.out.println("------------------------------------");
        for(int a = 1; a <= 5; a++){
            // a = 1,2,3,4,5
            System.out.println("Helloword");
        }
        System.out.println("---------------------------------------");
        for(int b = 1; b <= 10; b += 2){
            //b = 1,3,5,7,9
            System.out.println("Helloword");
        }
    }
}
