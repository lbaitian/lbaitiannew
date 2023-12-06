package Chapter07;

public class report01 {
    public static void main(String[] args) {
        //String对象，并封装要处理的字符串的两种方式
        //1.直接双引号得到字符串对象，封装字符串数据
        String name = "li ran";
        System.out.println(name);

        //2.new String 创建字符串对象，并调用构造器初始化字符串
        String rs1 = new String();//创建一个空白字符串对象，不含有任何内容
        System.out.println(rs1);

        String rs2 = new String("li ran");//根据传入的字符串内容，来创建字符串对象
        System.out.println(rs2);

        char[] chars = {'a', '李', '拜','天'};//根据字符数组的内容，来创建字符串对象
        String rs3 = new String(chars);
        System.out.println(rs3);

        byte[] bytes = {97, 98, 99};//根据字节数组内容，来创建字符串对象
        String rs4 = new String(bytes);
        System.out.println(rs4);
    }
}
