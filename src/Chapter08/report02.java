package Chapter08;

import java.util.ArrayList;

public class report02 {
    public static void main(String[] args) {
        //ArrayList案例
        /*
        需求：现在假如购物车中存储了如下这些商品：Java入门，宁夏枸杞，黑枸杞，人字拖，特级枸杞，枸杞子。现在用户不想买枸杞了，选择了批量删除，请完成该需求。
        分析：
            ① 后台使用ArrayList集合表示购物车，存储这些商品名。
            ② 遍历集合中的每个数据，只要这个数据包含了“枸杞” 则删除它。
            ③ 输出集合看是否已经成功删除了全部枸杞数据了
         */
        //1.
        ArrayList<String> list = new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");
        System.out.println(list);

        //2.从集合中找到包含“枸杞”的数据删除它
        /*
        for (int i = 0; i < list.size(); i++) {
            //i = 0 1 2 3 4 5
            //取出当前遍历到的数据
            String ele = list.get(i);
            //判断这个数据中包含枸杞
            if (ele.contains("枸杞")){
                //从集合中删除
                list.remove(ele);
            }
        }
        System.out.println(list);*/


        //方法一：每次删除一个数据，就让i往左边退一步
        /*
        for (int i = 0; i < list.size(); i++) {
            //i = 0 1 2 3 4 5
            //取出当前遍历到的数据
            String ele = list.get(i);
            //判断这个数据中包含枸杞
            if (ele.contains("枸杞")){
                //从集合中删除
                list.remove(ele);
                i--;
            }
        }
        System.out.println(list);
         */

        //方式二：从集合后面倒着遍历
        for (int i = list.size() - 1; i >= 0 ; i++) {
            //取出当前遍历到的数据
            String ele = list.get(i);
            //判断这个数据中包含枸杞
            if (ele.contains("枸杞")){
                //直接从集合中删除该数据
                list.remove(ele);
            }

            
        }
        System.out.println(list);
    }

}
