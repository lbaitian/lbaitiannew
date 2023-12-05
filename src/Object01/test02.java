package Object01;

public class test02 {
    public static void main(String[] args) {
        //认识this
        //1.this就是一个变量，可以用在方法中，用来拿到当前对象；
        // 那个对象调用方法，this就指向那个对象，也就是拿到那个对象
        //2.this用来解决对象的成员变量与方法内部变量的名称一样时，导致访问冲突问题
        report02 s1 = new report02();
        System.out.println(s1);
        s1.printThis();

        System.out.println("------------------------");

        report02 s2 = new report02();
        System.out.println(s2);
        s2.printThis();

        report02 s3 = new report02();
        s3.score = 325;
        s3.printPass(250);
    }
}
