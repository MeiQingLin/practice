package oop04;

/**
 * 二分查找/折半查找
 * 这种查找算法是建立在排序的基础之上
 */
public class ArrayTest05 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33};
        int index = binarySearch(arr,9);
        System.out.println(index >= 0 ? "找到该数了,该数的下标是:" + index : "未找到该数!");
    }

    public static int binarySearch(int[] arr, int num) {
        int begin = 0;
        int end = arr.length - 1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if(arr[mid] == num){
                return mid-1;
            }else if(arr[mid] > num ){
                end = mid-1;
            }else{
                begin = mid;
            }
        }
        return -1;
    }
}
