package Chapter04;

public class report04 {
    public static void main(String[] args) {
        
        //需求：某部门每名员工的销售额分别是：16，26，36，6，100，计算他们部门的总销售额
        /*
        分析：
        1.定义一个数组存储5名员工的销售额
        2.定义一个变量用于累加求和
        3.遍历这个数组中的每个数据
         */
        int[] money ={16,26,36,6,100};
        int sum =0;
        for (int i = 0; i < money.length; i++) {
            sum += money[i];

        }
        System.out.println("总销售额：" + sum);
    }
}
