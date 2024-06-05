package oop01;

//根据值数组中该值的下标(第一次出现的地方)
public class ArrayTest05 {
    public static void main(String[] args) {
        int[] arr = {3,4,6,88,99,99,14,10};
        System.out.println(searchIndexOfNumber(arr,99) >= 0
                ? arr[searchIndexOfNumber(arr,99)] + "在数组中第一次出现时的下标是:" + searchIndexOfNumber(arr, 99)
                : "该数在数组中未出现");

    }
    //左边传数组变量,右边传要查找的值
    public static int searchIndexOfNumber(int[] arr, int number) {
        //跟下标有关,无法使用for-each循环
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == number) {
                return i;
            }
        }
        //没找到返回 -1
        return -1;
    }
}
