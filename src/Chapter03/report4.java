package Chapter03;

public class report4 {
    public static void main(String[] args) {
        //do-while循环
        int i = 0;
        do {
            System.out.println("Hello word");
            i++;
        }while(i < 3);
        System.out.println("--------------------------------");

        for (int j = 0; j < 3; j++) {
            System.out.println("Hello word");

        }
        System.out.println("------------------------");

        int m = 0;
        while (m < 3){
            System.out.println("Hello word");
            m++;
        }
        System.out.println(m);// 3
    }
}
