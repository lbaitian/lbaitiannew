package Chapter06;

public class report06 {
    public static void main(String[] args) {
        //需求：如果两个int类型的数组，元素个数，对应位置的元素内容都是一样的，则认为这两个数组是一摸一样的。
        /*
        分析：
        1.方法书否需要接收数据处理：需要接受两个int类型的数组，因此，形参声明为：int【】 arr1,int【】 arr2
        2.方法是否需要返回数据：方法判断完后需要返回：true和false，因此返回类型声明为doolean类型。
         */
        int[] arr1 = null;
        int[] arr2 ={10,20,30};
        System.out.println(equals(arr1,arr2));
    }
    public static boolean equals(int[] arr1, int[] arr2){
        //1.判断arr1和arr2是否都是null
        if (arr1 == null && arr2 == null) {
            return true;//相等
        }
        //2.判断arr1是null，或者arr2是null
        if (arr1 == null || arr2 == null){
            return false;//不相等
        }
        //3.判断两个数组的长度是否一样，如果长度一样，直接返回false
        if(arr1.length != arr2.length){
            return false;//不相等
        }
        //4.两个数组的长度是一样的，接着比较他们的内容是否一样

            for (int i = 0; i < arr1.length; i++) {
                //判断当前位置2个数组的元素是否是一样的，不一样直接返回false
                if(arr1[i] != arr2[i]){
                    return false;//不相等
                }

            }
            return true;//两个数组是一样的
        }
    }

