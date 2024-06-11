package oop04;

/**
 * 冒泡排序的优化
 * 因为冒泡排序存在提前排序成功的可能,因此我们要对冒泡排序进行优化,此处优化我用了假设法
 * 假设已经排序成功
 */

public class ArrayTest02 {
    public static void main(String[] args) {
        int[] arr = {5,1,2,3,6,4};
        bubbleSort(arr);
        for(int numbers : arr){
            System.out.print(numbers);
        }
    }

    public static void bubbleSort(int[] arr){
        for(int i = arr.length - 1; i > 0; i--){
            //假设已经排序好了
            boolean flag = true;
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }
}
