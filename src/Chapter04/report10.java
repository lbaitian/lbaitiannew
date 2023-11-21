package Chapter04;

public class report10 {
    public static void main(String[] args) {
        //数组的赋值机制
        /*
        1.基本数据类型赋值，这个值就是具体的数据，而且相互不影响
        int n1 = 2；int n2 = n1；
        2.数组在默认情况下是引用传递，赋的值是地址。
         */
        int n1 = 10;
        int n2 = n1;

        n2 = 80;
        System.out.println("n1=" + n1);// 10
        System.out.println("n2=" + n2);// 80
        //赋值方式是值拷贝
        System.out.println("-----------------------------------");

        //数组在默认情况下是引用传递，赋的值是地址，赋值方式是引用传递
        //是一个地址,arr2的变化会影响到arr1
        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;//把arr1赋值给arr2
        arr2[0] = 10;
        System.out.println("====arr1的元素====");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }

    }
}
