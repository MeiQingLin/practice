package oop01;

//找到数组中最大值的下标

public class ArrayTest04 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2,9,66,6};
        System.out.println(searchMaxNumberIndex(arr)); // 6
    }
    public static int searchMaxNumberIndex(int[] arr) {
        //先找到最大值
        int max = arr[0];
        //记录下标
        int index = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;

    }
}
