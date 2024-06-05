package oop01;

//数组反转
//用首尾交换的方式

public class ArrayTest06 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        for(int a: arr){
            System.out.println(a);
        }
        reverse(arr);
        for(int a: arr){
            System.out.println(a);
        }
    }

    public static void reverse(int[] arr) {
        //第一种方式:让第一个和最后一个换,第二个和倒数第二个换  首尾交换
        for(int i = 0; i < arr.length/2; i++ ) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}
