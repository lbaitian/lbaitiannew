package Chapter06;

public class report03 {
    public static void main(String[] args) {
        //需求：打印多行HelloWorld
        printHelloWorld(3);
        System.out.println("------------------------");
        printHelloWorld(6);
    }
        public static void printHelloWorld(int n){
            for (int i = 0; i <= n; i++) {
                System.out.println("Hello World");
                //如果方法不需要返回数据，返回值必须申明成void（无返回值申明），此时方法内部不可以使用return返回数据

            }
        }
    }

