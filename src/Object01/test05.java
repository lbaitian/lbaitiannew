package Object01;

public class test05 {
    public static void main(String[] args) {
        //目标：实体类的书写要求，特点，应用场景
        /*
        1.什么是实体类：成员变量必须私有，并且要为每个成员变量提供get set方法；必须有无参数构造器
        2.特点：仅仅只是一个用来保存数据的java类，可以用它创建对象，保存某个事物的数据
        3.应用场景：实体类对应的是软件开发中比较流行的开发方式，数据和数据业务处理相分离
         */
        report05 s1 = new report05();
        s1.setName("小李");
        s1.setScore(99);
        System.out.println(s1.getName());
        System.out.println(s1.getScore());

        reportOperator05 operator = new reportOperator05(s1);
        operator.printPass();
    }
}
