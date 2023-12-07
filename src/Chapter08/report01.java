package Chapter08;

import java.util.ArrayList;

public class report01 {
    public static void main(String[] args) {
        //1.创建一个ArrayList的集合对象
        ArrayList list = new ArrayList();//没有约束
        list.add("李拜天");
        list.add(666);
        list.add(99.6);
        list.add("乐乐");
        list.add("Java");
        System.out.println(list);
        System.out.println("---------------------------------");

        //2.创建一个有约束的ArrayList的集合对象
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("狗比乐乐");
        list1.add("java");
        list1.add("佳哥");
        System.out.println(list1);
        System.out.println("---------------------------------");

        //3.根据索引获取集合中某个索引位置处的值
        String rs = list1.get(1);
        System.out.println(rs);
        System.out.println("--------------------------------");

        //4.获取集合的大小（返回集合中存储的元素个数）
        System.out.println(list1.size());
        System.out.println("----------------------------------");

        //5.根据索引删除集合中的某个元素值，会返回被删除的元素值给我们
        System.out.println(list1.remove(1));
        System.out.println(list1);
        System.out.println("-------------------------------------");

        //6.直接删除某个元素值，删除成功返回true，反之
        System.out.println(list1.remove("java"));
        System.out.println(list1);

        list1.add(1,"html");
        System.out.println(list1);

        //7.修改某个索引位置处的数据，修改后会返回原来的值给我们
        System.out.println(list1.set(1,"程序员"));




    }
}
