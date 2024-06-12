package oop04;

/**
 * 线性查找
 * 简单粗暴的一种查找法,采用逐一对比的方式对数组进行遍历,如果发现匹配值,返回下标即可
 * 优点是查找数组无需排序,缺点是查找的次数多,效率低
 */

public class ArrayTest04 {
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,666};
        System.out.println(linearSearch(arr, 111) >= 0 ? "找到了该数,该数的下标是:" + linearSearch(arr, 666) : "未找到该数");
    }

    public static int linearSearch(int[] arr,int num) {
        for (int i = 0; i < arr.length; i++) {
            //如果找到,返回该元素下标
            if(num == arr[i]){
                return i;
            }
        }
        //当循坏结束还没找到,返回-1
        return -1;
    }
}
