package Chapter04;

public class report11 {
    public static void main(String[] args) {
        //1.把arr【0】和arr【5】进行交换{66，22，33，44，55，11}
        //2.把arr【1】和arr【4】进行交换{66，55，33，44，22，11}
        //3.把arr【2】和arr【3】进行交换{66，55，33，33，22，11}
        //4.一共要交换3次，所以= arr.length / 2
        //5.每次交换时，对应的下标时 arr[i] 和 arr【arr.length - 1 - i]
        int[] arr = {11,22,33,44,55,66};
        int temp = 0;
        int len = arr.length;
        for(int i = 0; i < len / 2; i++) {
            temp = arr[len - 1 - i];
            arr[len -1 -i] = arr[i];
            arr[i] = temp;
        }
        System.out.println("===反转后数组===");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");

        }
    }
}
