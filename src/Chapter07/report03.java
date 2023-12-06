package Chapter07;

import java.util.Scanner;

public class report03 {
    public static void main(String[] args) {
        //需求：系统正确的登录名和密码时：ithima/123456,请在控制台开发一个登陆界面，
        // 接受用户输入的登录名和密码，判断用户是否登录成功，登陆成功后展示：”欢迎进入系统！“，即可停止程序。（注意：要求最多给用户三次登录机会）
        /*
        1.开发登录界面，提示用户通过键盘输入登录名和密码
        2.设计一个登录方法，对用户的登录名和密码进行正确性确认
        3.根据登录方法返回的认证结果，判断用户是否登录成功
        4.使用循环控制登录界面最多显示3次
         */
        //1.开发一个登陆界面
        for (int i = 0; i < 3; i++) {
            //这个循环允许用户尝试登录三次。它迭代三次，如果登录在三次尝试后仍然不成功，程序将退出
            Scanner sc = new Scanner(System.in);
            //这一行创建了一个Scanner对象(sc)，允许程序从控制台读取输入
            System.out.println("请您输入登录名称");
            String loginName = sc.next();
            System.out.println("请您输入登录密码");
            String passWord = sc.next();

        //5.开始调用登录方法，判断是否登陆成功
        boolean rs = login(loginName, passWord);//调用login方法，并将输入的登录名和密码传递给它，然后将结果存储在变量rs中
        if(rs){
            System.out.println("恭喜你，欢迎进入系统~~");
            break;
        }else {
            System.out.println("登录名或密码错误，请您确认！！");
            //如果登录成功（rs为true），则输出成功消息并使用break退出循环。如果登录不成功，则输出错误消息
            //login方法比较输入的登录名和密码与预定义的值（okLoginName和okPassWord）。如果它们匹配，方法返回true，表示登录成功；否则，返回false
        }
        }
    }
    //2.开发一个登陆方式，接收用户的登录名和密码，返回认证的结果
    public static boolean login(String loginName, String passWord){
        //这个方法接受两个参数（loginName和passWord），并返回一个布尔值（如果登录成功返回true，否则返回false）
        //3.准备一份系统正确的登录名和密码
        String okLoginName = "ithima";
        String okPassWord = "123456";

        //4.开始正式判断用户是否登录成功
        if(okLoginName.equals(loginName) && okPassWord.equals(passWord)){
            //登陆成功的
            return true;
        }else {
            return false;
        }
    }
}
