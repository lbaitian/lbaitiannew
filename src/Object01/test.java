package Object01;

public class test {
    public static void main(String[] args) {
        report01.Student s1 = new report01.Student();
        s1.name = "小李";
        s1.chinese = 100;
        s1.math = 100;
        s1.printTotalScore();
        s1.printAverageScore();

        report01.Student s2 = new report01.Student();
        s2.name = "张三";
        s2.chinese = 59;
        s2.math = 100;
        s2.printTotalScore();
        s2.printAverageScore();
    }
}
