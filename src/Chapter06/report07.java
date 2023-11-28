package Chapter06;

public class report07 {
    public static void main(String[] args) {
        //方法重载
        fire();
        fire("米国",999);
    }
    public static void fire(){
        System.out.println("默认给岛国发射了一枚导弹");
    }
    public static void fire(String county){
        System.out.println("发射一枚导弹给" + county);
    }
    public static void fire(String county, int number){
        System.out.println("发射了" + number + "枚导弹给" + county);
    }
}
