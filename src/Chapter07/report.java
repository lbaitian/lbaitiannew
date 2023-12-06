package Chapter07;

public class report {
    public static void main(String[] args) {
        //目标：String使用时的注意事项
        //1.String的对象时不可变的？？？
        String name = "李拜天";
        name += "程序员";
        name += "李四";
        System.out.println(name);
        System.out.println("------------------------");

        //2.只要是以双引号给出的字符串对象，存储在常量池中，而且内容相同时只会存储一份
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);
        System.out.println("------------------------");

        //3.new String创建字符串对象，每次new出来的都是一个新对象，放在堆内存中
        char[] chars = {'a', 'b', 'c'};
        String a1 = new String(chars);
        String a2 = new String(chars);
        System.out.println(a1 == a2);
        System.out.println("------------------------");

        String b1 = "abc";
        String b2 = "ab";
        String b3 = b2 + "c";
        System.out.println(b1 == b3);
        System.out.println("------------------------");

        String c1 = "abc";
        String c2 = "a" + "b" + "c";
        System.out.println(c1 == c2);
    }
}
