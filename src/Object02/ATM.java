package Object02;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private Account loginAcc;//记住登录后的用户账户
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

     //完成用户的登录操作
    private void login(){
        System.out.println("===系统登录===");
        //1.判断系统中是否存在账户对象，存在登录；不存在结束操作
        if(accounts.size() == 0){
            return;//跳出登录操作
        }
        //2.系统中存在账户对象，可以开始进行登陆操作了
        while (true) {
            System.out.println("请输入您的登录卡号：");
            String cardId = sc.next();
            //3.判断这个卡号是否存在
            Account acc = getAccountByCardId(cardId);
            if(acc == null){
                //说明这个卡号不存在
                System.out.println("您输入的登录卡号不存在，请确认！！");
            }else {
                while (true) {
                    //卡号存在
                    System.out.println("请您输入密码：");
                    String passWord = sc.next();
                    //4.判断密码是否正确
                    if (acc.getPassWord().equals(passWord)) {
                        loginAcc = acc;
                        // 密码正确，登录成功
                        System.out.println("恭喜您" + acc.getUserName() + "成功登录系统，您的卡号是：" + acc.getCardId());
                        //展示登陆后的操作界面
                        showUserCommand();
                        return;//跳出并结束当前登录方法
                    } else {
                        System.out.println("您输入的密码不正确，请确认！");
                    }
                }

            }
        }


    }

    //展示登录后的操作界面
    private void showUserCommand(){
        while (true) {
            System.out.println(loginAcc.getUserName() + "您可以选择如下功能进行账户处理：");
            System.out.println("1.查询账户");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.密码修改");
            System.out.println("6.退出");
            System.out.println("7.注销当前账户");
            System.out.println("请选择：");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    //查询当前账户
                    showLoginAccount();
                    break;
                case 2:
                    //存款
                    depositMoney();
                    break;
                case 3:
                    //取款
                    drawMoney();
                    break;
                case 4:
                    //转账
                    transferMoney();
                    break;
                case 5:
                    //密码修改
                    updatePassWord();
                    return;
                case 6:
                    //退出
                    System.out.println(loginAcc.getUserName() + "您退出系统成功！！！");
                    return;//跳出并结束当前方法
                case 7:
                    //注销当前账户
                    if(deleteAccount()){
                        //销户成功，回到欢迎界面
                        return;
                    }
                    break;
                default:
                    System.out.println("您当前选择的操作不存在！！！！");
            }
        }
    }

    //账户密码修改
    private void updatePassWord() {
        System.out.println("==账户密码修改操作==");
        while (true) {
            //1.提醒用户认证当前密码
            System.out.println("请您输入当前账户密码：");
            String passWord = sc.next();

            //2.认证当前密码是否正确
            if (loginAcc.getPassWord().equals(passWord)){
                //认证通过
                while (true) {
                    //3.真正开始修改密码
                    System.out.println("请您输入新密码：");
                    String newPassWord = sc.next();

                    System.out.println("请您再次输入确认密码：");
                    String okPassWord = sc.next();

                    //4.判断两次密码是否一致
                    if (okPassWord.equals(newPassWord)){
                        //可以真正开始修改密码
                        loginAcc.setPassWord(okPassWord);
                        System.out.println("恭喜您，您的密码修改成功！！！");
                        return;

                    }else {
                        System.out.println("您输入的两次密码不一致！！！");
                    }
                }

            }else {
                System.out.println("您当前输入的密码不正确！！");
            }
        }
    }

    //销户操作
    private boolean deleteAccount() {
        System.out.println("==进行销户操作==");
        //1.询问用户是否确定要销户
        System.out.println("请问您是否确认销户嘛？y/n");
        String command = sc.next();
        switch (command) {
            case "y":
                //确定要销户
                //2.判断用户的账户中是否有钱：loginAcc
                if (loginAcc.getMoney() == 0) {
                    //真的销户
                    accounts.remove(loginAcc);
                    System.out.println("您好，您的账户已经成功销户！！！");
                    return true;
                }else {
                    System.out.println("对不起，您的账户中存在金额，不允许销户！！！");
                    return false;
                }
            default:
                System.out.println("好的，您的账户保留！！");
                return false;
        }

    }

    //转账
    private void transferMoney() {
        System.out.println("===用户转账===");
        //1.判断系统中是否存在其他账户
        if (accounts.size() < 2){
            System.out.println("当前系统中只有你一个账户，无法给其他账户转账！！！");
            return;
        }
        //2.判断自己的账户中是否有钱
        if (loginAcc.getMoney() == 0){
            System.out.println("您的账户余额不足，无法转账！！！");
            return;
        }

        //3.真正开始转账
        while (true) {
            System.out.println("请输入对方的卡号：");
            String cardId = sc.next();

            //4.判断这个卡号是否正确
            Account acc = getAccountByCardId(cardId);
            if(acc == null){
                System.out.println("您输入的对方卡号不存在！！！");
            }else {
                //对方的账户存在，继续认证姓式
                String name = "*" + acc.getUserName().substring(1);
                System.out.println("请您输入[" + name + "]姓式");
                String preName = sc.next();
                //5.判断这个姓氏是否正确
                if (acc.getUserName().startsWith(preName)) {
                    while (true) {
                        //认证通过，开始转账
                        System.out.println("请您输入给对方转账的金额：");
                        double money = sc.nextDouble();
                        //6.判断金额有没有超过自己的余额
                        if (loginAcc.getMoney() >= money){
                            //转给对方了
                            //更新自己的账户余额
                            loginAcc.setMoney(loginAcc.getMoney() - money);
                            //更新对方的账户余额
                            acc.setMoney(acc.getMoney() + money);
                            return;//直接跳出
                        }else {
                            System.out.println("余额不足，无法给对方转这么多钱，最多可转：" + loginAcc.getMoney());
                        }
                    }
                }else {
                    System.out.println("对不起，您认证的姓氏有问题！！！");
                }
            }
        }
    }

    //取钱
    private void drawMoney() {
        System.out.println("===取钱操作===");
        //1.判断账户余额是否达到100元，如果不够100元，就不让用户取钱了
        if(loginAcc.getMoney() < 100){
            System.out.println("您的账户余额不足100元，不允许取钱！！！");
            return;
        }
        //2.让用户输入取款金额
        while (true) {
            System.out.println("请您输入取款金额：");
            double money = sc.nextDouble();

            //3.判断账户余额是否足够
            if (loginAcc.getMoney() >= money) {
                //账户中的余额是足够的
                //4.判断当前取款金额是否超过每次限额
                if (money > loginAcc.getLimit()) {
                    System.out.println("您当前取款金额超过了每次限额，您最多可取：" + loginAcc.getLimit());
            } else {
                //代表可以开始取钱。更新当前的账户的余额即可
                loginAcc.setMoney(loginAcc.getMoney() - money);
                System.out.println("您取款：" + money + "成功，取款后您的剩余：" + loginAcc.getMoney());
                break;

            }
            }else {
                System.out.println("余额不足，您的账户中的余额是：" + loginAcc.getMoney());
            }
        }
    }

    //存钱
    private void depositMoney() {
        System.out.println("==存钱操作==");
        System.out.println("请您输入存款金额：");
        double money = sc.nextDouble();

        //更新当前登录的账户余额
        loginAcc.setMoney(loginAcc.getMoney() + money);
        System.out.println("恭喜您，您存钱：" + money + "成功，存钱后余额是：" + loginAcc.getMoney());
    }

    //展示当前登录信息
    private void showLoginAccount(){
        System.out.println("====当前您的账户信息如下：====");
        System.out.println("卡号" + loginAcc.getCardId());
        System.out.println("户主" + loginAcc.getUserName());
        System.out.println("性别" + loginAcc.getSex());
        System.out.println("余额" + loginAcc.getMoney());
        System.out.println("每次取现额度：" + loginAcc.getLimit());
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
