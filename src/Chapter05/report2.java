package Chapter05;

import java.util.Scanner;

public class report2 {
    public static void main(String[] args) {
        //顺序查找
        String[] names = {"上海", "北京", "无锡", "苏州"};
        Scanner myScanner = new Scanner(System.in);

        System.out.println("请输入名称：");
        String findName = myScanner.next();
        //遍历数组，逐一比较，如果有，提示信息并退出
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            //比较  字符串比较 equals, 如果要找到名字就是当前元素
            if (findName.equals(names[i])) {
                System.out.println("恭喜你找到了 " + findName);
                System.out.println("下标为= " + i);
                //把i 保存到 index
                index = i;
                break;//退出
            }
        }
        if (index == -1) { //没找到
            System.out.println("sorry ,没有找到 " + findName);

        }
    }
}
