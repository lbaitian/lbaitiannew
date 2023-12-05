package Object01;

public class report02 {
    double score;

    public void printThis(){
        System.out.println(this);

    }

    public void printPass(double score){
        if(this.score > score){
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }
    }
}
