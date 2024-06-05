package oop01;

//数组反转
//第二种方式,创建一个新数组(基本不用这种)
public class ArrayTest07 {
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
        //动态初始化数组
        int[] newArr = new int[arr.length];
        //遍历一遍新数组
        for(int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = newArr[newArr.length - 1 - i];
        }
    }
}
