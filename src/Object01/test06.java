package Object01;

import java.util.Scanner;

public class test06 {
    //需求：1.展示系统中的全部电影（每部电影展示：名称，价格）
    //2.允许用户根据电影编号（id）查询出某个电影的详细信息
    public static void main(String[] args) {
        //1.设计一个电影类
        //2.设计电影操作类
        //3.准备电影数据
        report06[] movies = new report06[4];
        movies[0] = new report06(1, "水门桥", 38.9, 9.8, "徐克", "吴京", "12万人想要观看");
        movies[1] = new report06(2, "夏洛特烦恼", 39, 8.8, "闫非和彭大魔", "沈腾，马丽", "8万人想要观看");
        movies[2] = new report06(3, "红海行动", 42, 9.4, "林超贤", "张译", "11万人想要观看");
        movies[3] = new report06(4, "你好，李焕英", 40, 9.1, "贾玲", "张小斐", "15万人想要观看");
        /*
        report06 m1 = new report06(1,"水门桥",38.9,9.8,"徐克","吴京","12万人想要观看");
        report06 m2 = new report06(2,"夏洛特烦恼",39,8.8,"闫非和彭大魔","沈腾，马丽","8万人想要观看");
        report06 m3 = new report06(3,"红海行动",42,9.4,"林超贤","张译","11万人想要观看");
        report06 m4 = new report06(4,"你好，李焕英",40,9.1,"贾玲","张小斐","15万人想要观看");
        movies[0] = m1;
        movies[1] = m2;
        movies[2] = m3;
        movies[3] = m4;
        */
        //4.创建一个电影操作对象，接受电影数据，并对其进行业务处理
        reportOperator06 operator = new reportOperator06(movies);
        //operator.printAllmovies();//查询全部电影信息
        //operator.searchMovieById(3);//利用id查询某一个电影的全部信息
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("===电影信息系统===");
            System.out.println("1.查询全部电影信息");
            System.out.println("2.根据id查询某个电影的详细信息展示");
            System.out.println("请您输入操作命令：");

            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //展示全部电影信息
                    operator.printAllmovies();
                    break;
                case 2:
                    //根据id查询某个电影的详细信息展示
                    System.out.println("请您输入查询的电影id：");
                    int id = sc.nextInt();
                    operator.searchMovieById(id);
                    break;
                default:
                    System.out.println("您输入的命令有问题！！");
            }
        }
    }
}