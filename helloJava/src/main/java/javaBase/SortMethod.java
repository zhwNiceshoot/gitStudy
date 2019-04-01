package javaBase;

/**
 * Created by zhangwei on 2019/3/30
 **/

public class SortMethod {
    /**
     * 直接排序法
     * */
    public static void directSort(int[] num){
        int tmp;
        int j;
        for (int i = 1;i < num.length;i ++){
            tmp = num[i];   //定义临时变量
            for (j = i - 1;j >= 0 && num[j] > tmp;j --){
                num[j + 1] = num[j];
            }
            num[j + 1] = tmp;
        }
        for (int i = 0;i < num.length;i ++){
            System.out.print(num[i] + " ");
        }
    }

    /**
     * 冒泡排序法
     * */
    public static void bubbleSort(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = 0; y < arr.length - x - 1; y++) {
                if (arr[y] > arr[y + 1]) {
                    int temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                }
            }
        }
        for (int i = 0;i < arr.length;i ++){
            System.out.print(arr[i] + " ");
        }    }

    /**
     * 主函数测试验证
     * */
    public static void main(String[] args){
        int[] num = {5,2,6,4,3};
        System.out.println("排序前：");
        for (int i = 0;i < num.length;i ++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
        System.out.println("排序后：");
        directSort(num);
        System.out.println();
        bubbleSort(num);

    }
}
