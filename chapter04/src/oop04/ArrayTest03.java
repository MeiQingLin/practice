package oop04;

/**
 * 选择排序
 * 核心思想:在未排序的序列中,将未排序的第一个元素和未排序的最小元素交换位置
 * 虽然循环的次数虽然没变,但是交换的次数会减少
 */
public class ArrayTest03 {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        selectionSort(arr);
        for(int numbers : arr){
            System.out.print(numbers);
        }
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            //假设未排序的第一个元素最小,下标用min来存
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            //如果内循环结束后,发现min的值变了,说明找到了更小的值,与其交换位置
            //注意:不加判断也可以,但是这几步执行有可能会多余。例如,第一个元素就是最小的,那下面三行代码执行起来将没有意义
            if(min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
