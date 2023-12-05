package Object01;

public class reportOperator06 {
    //定义一个数组
    private report06[] movies;
    //创建一个有参构造器
    public reportOperator06(report06[] movies){
        this.movies = movies;
    }
    //1.展示系统全部电影信息
    public void printAllmovies(){
        System.out.println("-------------系统全部信息如下---------------");
        //直接遍历数组
        for (int i = 0; i < movies.length; i++) {
            report06 m = movies[i];
            System.out.println("编号" + m.getId());
            System.out.println("名称" + m.getName());
            System.out.println("价格" + m.getPrice());
            System.out.println("----------------------------");
        }
    }
    //2.根据电影编号（id）查询出该电影的详细信息并展示
    public void searchMovieById(int id){
        for (int i = 0; i < movies.length; i++) {
            report06 m = movies[i];
            if(m.getId() == id){
                System.out.println("---------电影详情如下---------");
                System.out.println("编号" + m.getId());
                System.out.println("名称" + m.getName());
                System.out.println("价格" + m.getPrice());
                System.out.println("得分" + m.getScore());
                System.out.println("导演" + m.getDirector());
                System.out.println("演员" + m.getActor());
                System.out.println("其他" + m.getInfo());
                return;//已经找到电影信息，没有必要在执行了
            }

        }
        System.out.println("没有该电影信息！！！");
    }
}
