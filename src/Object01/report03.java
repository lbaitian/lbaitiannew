package Object01;

public class report03 {
    String name;
    double score;
    //无参数构造器
    public report03(){
        System.out.println("无参数构造器被触发执行");
    }

    //有参数构造器
    public report03(String name, double score){
        System.out.println("有参数构造器被触发");
        this.name = name;
        this.score = score;
    }
}
