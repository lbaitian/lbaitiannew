package Object02;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    //启动ATM系统 展示欢迎界面
    public void start(){
        while (true){
            System.out.println("===欢迎您进入ATM系统===");
            System.out.println("1.用户登录");
            System.out.println("2.用户开户");
            System.out.println("请选择：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //用户登录
                    break;
                case 2:
                    //用户开户
                    createAccount();
                    break;
                default:
                    System.out.println("没有该操作！！！");
            }
        }
    }

    //完成用户开户操作
    private void createAccount(){
        //1.创建一个账户对象，用于封装用户的开户信息
        Account acc = new Account();

        //2.需要用户输入自己的开户信息，赋值给账户对象
        System.out.println("请输入您的账户名称：");
        String name = sc.next();
        acc.setUserName(name);

        while (true){
            System.out.println("请输入您的性别：");
            char sex = sc.next().charAt(0);//"男"
            if(sex == '男' || sex == '女'){
                acc.setSex(sex);
                break;
            }else {
                System.out.println("您输入的性别有误，只能是男或是女！！");
            }
        }
        while (true){
            System.out.println("请您输入您的账户密码：");
            String passWord = sc.next();
            System.out.println("请您输入您的确认密码：");
            String okPassWord = sc.next();
            //判断两次密码是否一样
            if(okPassWord.equals(passWord)){
                acc.setPassWord(okPassWord);
                break;
            }else {
                System.out.println("您输入的2次密码不一致，请您确认~~");
            }
        }
        System.out.println("请您输入您的取现额度: ");
        double limit = sc.nextDouble();
        acc.setLimit(limit);

        //重点：我们需要为这个账户生成一个卡号（由系统自动生成。8位数字表示，不能与其他账户的卡号重复）
        String newCardId = createCardId();
        acc.setCardId(newCardId);
        //3.把这个账户对象，存入到账户集合中去
        accounts.add(acc);
        System.out.println("恭喜你，" + acc.getUserName() + "开户成功，您的卡号是：" + newCardId);
    }

    //返回一个8位数字的卡号，而且这个卡号不能与其他账户的卡号重复
    private String createCardId(){
        while (true) {
            //1.定义一个String类型的变量记住8位数字作为一个卡号
            String cardId = "";
            //2.使用循环，循环8次，每次产生一个随机数给cardId连接起来
            Random r = new Random();
            for (int i = 0; i < 8; i++) {
                int data = r.nextInt(10); //0-9
                cardId += data;
            }
            //3.判断cardId中记住的卡号，是否与其他账户的卡号重复了，没有重复，才可以作为一个新的卡号返回
            Account acc = getAccountByCardId(cardId);
            if (acc == null) {
                return cardId;
            }
        }
    }

    //根据卡号查询对象返回 accounts = {c1, c2, c3,,,}
    private Account getAccountByCardId(String cardId){
        //遍历全部账户对象
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            //判断这个账户对象acc中的卡号是否是我们要找的卡号
            if(acc.getCardId().equals(cardId)){
                return acc;
            }
        }
        return null;//查无此账户，这个卡号不存在
    }
}
