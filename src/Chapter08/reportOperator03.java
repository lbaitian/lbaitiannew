package Chapter08;

import java.util.ArrayList;
import java.util.Scanner;

public class reportOperator03 {
    //1.定义一个ArrayList集合对象，负责存储菜品对象信息
    private ArrayList<report03> foodlist = new ArrayList<>();
    //foodlist = []

    //2.开发功能：上架菜品功能
    public void addFood(){
        //3.创建一个菜品对象，封装上架的菜品信息
        report03 f = new report03();

        //4.录入菜品信息进去
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入该菜品名称：");
        String name = sc.next();
        f.setName(name);

        System.out.println("请您输入菜品价格：");
        double price = sc.nextDouble();
        f.setPrice(price);

        System.out.println("请您输入菜品描述：");
        String desc = sc.next();
        f.setDesc(desc);

        //5.把菜品对象存入集合中
        foodlist.add(f);
        System.out.println("上架成功！！！");
    }
    //6.展示菜品
    public void showAllFood(){
        if (foodlist.size() == 0){
            System.out.println("没有任何菜品，先去上架！！");
            return;
        }
        for (int i = 0; i < foodlist.size(); i++) {
            report03 f = foodlist.get(i);
            System.out.println(f.getName());
            System.out.println(f.getPrice());
            System.out.println(f.getDesc());
            System.out.println("--------------------------");
        }
    }
    //负责展示操作界面
    public void start(){
        while(true){
            System.out.println("请选择功能：");
            System.out.println("1.上架菜品");
            System.out.println("2.展示菜品");
            System.out.println("3.退出");

            Scanner sc = new Scanner(System.in);
            System.out.println("请选择您的操作：");
            String command = sc.next();
            switch (command) {
                case "1":
                    addFood();
                    break;
                case "2":
                    showAllFood();
                    break;
                case "3":
                    System.out.println("下次再来！！！");
                    return;
                default:
                    System.out.println("您输入的命令不存在！！！");
            }
        }
    }
}
