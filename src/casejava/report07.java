package casejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class report07 {
    public static void main(String[] args) {
        // 需求：抢红包活动，分别有：9、666、188、520、99999五个红包。
        //请模拟粉丝来抽奖，按照先来先得，随机抽取，抽完即止，注意：一个红包只能被抽一次，先抽或后抽哪一个红包是随机的，示例如下（不一定是下面的顺序）：
        //分析：
        //1. 方法是否需要接收数据进行处理？需要接收一个数组，里面是5个金额，表示5个红包
        //2． 方法是否需要返回数据？不需要
        //3.方法内部完成本需求的第2种方案：先把数组中的5个金额打乱顺序，打乱后的顺序就是中奖顺序；
        // 接着写一个for循环，执行5次，每次都提示抽奖；每次抽奖都依次取出数组中的每个位置处的金额作为中奖金额

                // 定义红包金额数组
                int[] redPacketAmounts = {9, 666, 188, 520, 99999};

                // 调用抽奖方法
                drawRedPackets(redPacketAmounts);
            }

            public static void drawRedPackets(int[] redPacketAmounts) {
                // 使用 ArrayList 存储红包金额
                List<Integer> redPackets = new ArrayList<>();
                for (int amount : redPacketAmounts) {
                    redPackets.add(amount);
                }

                // 打乱红包金额顺序
                Collections.shuffle(redPackets);

                // 抽奖
                for (int i = 0; i < redPackets.size(); i++) {
                    int winningAmount = redPackets.get(i);
                    System.out.println("粉丝抽到的红包金额：" + winningAmount);
                }
            }
        }



