package Chapter06;

import static java.lang.Integer.sum;

public class report02 {
    public static void main(String[] args) {
        //方法
        /*
        修饰符 返回值类型 方法名（形参列表）{
        方法体代码（需要执行的功能代码）
        return 返回值；
        }
         */
        System.out.println("---开始---");
        int rs = sum(10, 20);//必须调用
        System.out.println("和是：" + rs);

        System.out.println("---结束---");
    }
    public static int sum(int a,int b){
//方法修饰符  返回值类型  方法名 形参列表

        int c = a + b;//方法的执行代码
        return  c; //返回值
        //注意：方法申明了具体的返回值类型，内部必须使用return返回对应类型的数据

    }
}
