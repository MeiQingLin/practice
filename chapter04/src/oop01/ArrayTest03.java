package oop01;

//找到数组中的最大值

public class ArrayTest03 {
    public static void main(String[] args) {
        int[] arr = {3,7,2,8,4,19,9};
        System.out.println(searchMaxNumber(arr));
    }

    public static int searchMaxNumber(int[] arr) {
        //将第一个数当成最大值
        int max = arr[0];
        //不需要要用到下标,用for-each循环
        for(int a: arr){
            if(a>max){
                max = a;
            }
        }
        return max;
    }
}
