package Object01;

public class test04 {
    public static void main(String[] args) {
        //目标：掌握封装的设计规范：合理隐藏合理暴露
        /*
        封装：1.就是用类设计对象处理某一个事物的数据时，
        应该要把处理的数据，以及处理这些数据的方法，设计到一个对象中去。
        2.面对对象的三大特征：封装，继承，多态

        （1）公开成员，使用public（公开）进行修饰
        （2）隐藏成员，使用private（私有，隐藏）进行修饰
         */
        report04 s1 = new report04();
        s1.setScore(99);
        System.out.println(s1.getScore());
    }
}
