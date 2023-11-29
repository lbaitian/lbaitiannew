package casejava;

public class report02 {
    public static void main(String[] args) {
        //需求：用户购买机票时，机票原价会按照淡季、旺季，头等舱还是经济舱的情况进行相应的优惠，
        // 优惠方案如下：5-10月为旺季，头等舱9折，经济舱8.5折；11月到来年4月为淡季，头等舱7折，经济舱6.5折，请开发程序计算出用户当前机票的优惠价。
        //分析：1.方法是否需要接收数据？需要接受机票原价，当前月份，舱位类型
        //2.方法是否需要返回数据？需要返回计算出的机票优惠价
        //3.方法内部：先使用if判断月份是淡季还是旺季，然后使用switch分支判断头等舱还是经济舱
        double price = calculate(1000,8,"经济舱");
        System.out.println("优惠价是：" + price);
    }
    public static double calculate(double price, int month,String type){
        //判断当前月份是淡季还是旺季
        if(month >= 5 && month <= 10) {
            //旺季
            //2.判断舱位类型
            switch (type){
                case "头等舱":
                    price *= 0.9;
                    //price = price * 0.9;
                    break;
                case "经济舱":
                    price *= 0.85;
                    break;
            }
        }else {
            //淡季
            switch (type){
                case "头等舱":
                    price *= 0.7;
                    break;
                case "经济舱":
                    price *= 0.85;
                    break;
            }

        }
        return price;
    }
}
