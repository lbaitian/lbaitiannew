package Chapter02;

public class report05 {
    public static void main(String[] args) {
        //switch的使用,重复项目可以直接简化
        //多个case分支相同就可以直接放在同一个分支下
        String week = "周三";
        switch (week){
            case "周一":
                System.out.println("上班");
                break;
            case "周二":
            case "周三":
            case "周四":
                System.out.println("见客户");
                break;
            case "周五":
                System.out.println("等待下班");
                break;
            case "周六":
            case "周日":
                System.out.println("聚餐");
                break;
            default:
                System.out.println("输入有问题");
        }
    }
}
