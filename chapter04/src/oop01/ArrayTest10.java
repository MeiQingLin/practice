package oop01;

/**
 * 数组的扩容操作
 * 使用arraycopy()方法
 */

import static java.lang.System.arraycopy;

/**
 * 数组的长度一旦确定不可变
 * 如果对数组进行扩容操作,只能创建一个新的数组,然后原数组的数据全部拷贝到新数组中
 * 建议减少数组扩容次数,建议预测数据量,创建一个容量大小合适的数组
 */
public class ArrayTest10 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9};
        int[] arr2 = new int[arr1.length*2];
        arraycopy(arr1,3,arr2,0,6); //从arr1数组下标3位置开始拷,arr2数组下标0位置开始放,拷贝的长度是6
        for(int numbers : arr2){
            System.out.println(numbers);
        }
    }
}
