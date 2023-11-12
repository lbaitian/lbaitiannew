package Chapter01;

public class report02 {
    public static void main(String[] arge){
        String name = "lbaitian";
        int age = 23;
        double chengji =99.5;
        char xingbie = '女';
        System.out.println(name);
        System.out.println(chengji);
        System.out.println(age);
        System.out.println(xingbie);
        System.out.println("-------------------------------------------");
        System.out.println(100 + 98);
        System.out.println("100" + 98);
        System.out.println("hello" + 100 + 98);
        System.out.println(100 + 98 + "hello");
        System.out.println("---------------------------");
        int n1;
        n1 = 13;
        int n2;
        n2 = 17;
        int n3;
        n3 = n1 + n2;
        System.out.println("n3 = " + n3);
        int n4 = 38;
        int n5 = n4 - n3;
        System.out.println("n5 = " + n5);
        System.out.println("----------------------");
        String name1 = "libaitian";
        int age1  = 20;
        double score = 90.1;
        char gender = '女';
        String hobby = "足球";
        System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n "+ name1 +
                "\t"+ age1 + "\t" + score +"\t" + gender + "\t" + hobby);
    }


}
