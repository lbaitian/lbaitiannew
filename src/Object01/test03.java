package Object01;

public class test03 {
    public static void main(String[] args) {
        report03 s = new report03("小李",99);

        report03 s1 = new report03();
        s1.name = "小李";
        s1.score = 100;

        report03 s2 = new report03("小黑",99);
        System.out.println(s2.name);
        System.out.println(s2.score);
    }



}
