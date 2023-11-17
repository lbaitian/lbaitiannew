package Chapter03;

public class report3 {
    public static void main(String[] args) {
        int i = 0;
        while(i < 5){
            System.out.println("Hello word");
            i ++;
        }
        System.out.println("--------------------------------");

        //需求：纸张折叠多少次能超过珠穆朗玛峰的高度
        double zhugao = 8848860;
        double zhizhang = 0.1;
        int count = 0;//定义一个count变量来存储纸张折叠了几次
        //使用while循环
        while (zhizhang < zhugao){
            zhizhang = zhizhang * 2;
            //使用while循环来控制纸张折叠，循环条件是：纸张厚度<山峰高度；
            //循环每执行一次，就表示纸张折叠一次，并把纸张厚度变为原来的两倍
            count++;//每循环一次，count就加一
        }
        System.out.println("纸张折叠的次数：" + count);
        System.out.println("纸张最终的厚度：" + zhizhang);

    }
}
