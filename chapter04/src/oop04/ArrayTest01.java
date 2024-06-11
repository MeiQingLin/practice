package oop04;

/**
 * 冒泡排序
 * 核心思想:两个相邻的数进行比较,如果前面的数比后面的数大,两个数交换位置
 */

public class ArrayTest01 {
    public static void main(String[] args) {
        int[] arr = {7,4,6,8,1,3,2,5};
        bubbleSort(arr);
        for(int numbers : arr){
            System.out.print(numbers);
        }
    }

    public static void bubbleSort(int[] arr){
        for(int i = arr.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

