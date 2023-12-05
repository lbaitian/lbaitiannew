package Object01;

public class report05 {
    //1.必须私有成员变量，并为每个成员变量提供get set方法
    private String name;
    private double score;

    //2.必须为类提供一个公开的无参数构造器


    public report05() {   //无参构造器
    }

    public report05(String name, double score) {  //有参构造器
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
