package javaBase;

/**
 * Created by zhangwei on 2019/3/29
 **/

public class FindMinValue {
    /**
     * 找出数组中的最小值
     * */
    public static int minValue(){
        int[] num = {8,4,2,1,3};
        int min = num[0];
        for (int i = 0;i < num.length - 1;i ++){
            if (min > num[i + 1]){
                min = num[i + 1];
            }
        }
        return min;
    }

    public static void main(String[] args){
        int x = minValue();
        System.out.println("最小值为：" + x);
    }

}
