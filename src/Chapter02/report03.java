package Chapter02;

public class report03 {
    public static void main(String[] args) {
        //switch的使用
        String week = "周三";
        switch (week){
            case "周一":
                System.out.println("上班");
                break;
            case "周二":
                System.out.println("摸鱼");
                break;
            case "周三":
                System.out.println("开会");
                break;
            case "周四":
                System.out.println("见客户");
                break;
            case "周五":
                System.out.println("等待下班");
                break;
            case "周六":
                System.out.println("睡觉");
                break;
            case "周日":
                System.out.println("聚餐");
                break;
            default:
                System.out.println("输入有问题");
        }
    }
}
