package Object01;

public class report04 {
    private double score;//添加 private就是隐藏

    public void setScore(double score){
        //通过这个方法，可以将传入的参数值赋给 score 实例变量
        if(score >= 0 && score <= 100){
            this.score = score;
        }else {
            System.out.println("数据非法");
        }


    }

    public double getScore() {
        //通过这个方法，可以从对象中获取存储的成绩值
        return score;
    }

    public void printPass(){
        //private就是隐藏，外界就无法访问了
        System.out.println(score >= 60 ? "成绩及格" : "成绩不及格");
    }
}
