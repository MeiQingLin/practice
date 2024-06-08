package oop01;

/**
 * 方法中的可变长度参数,可当作数组来看
 */

/**
 * 语法格式: 数据类型... 数组名
 * 例如: int... nums
 */

/**
 * 语法规则:在方法形参列表中,只能有一个可变长度参数,并且只能出现在末尾
 * 例如 public static void test(String i, int... numbers){}; 这样可以
 * 例如 public static void test(int... numbers, String i){}; 这样不行
 * 例如 public static void test(int... numbers1, int... numbers2){}; 这样也不行
 */

/**
 * 第一种传参方式:test(1, 2, 3, 4);
 * 第二种传参方式:test(new int[]{1,2,3,4});
 * 第三种传参方式:test(数组变量);
 */
public class ArrayTest09 {

    public static void test(int... numbers){
        for(int number : numbers){
            System.out.println(number);
        }
    };
    public static void main(String[] args) {
        //进行测试
        test(1, 2, 3, 4);

        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        test(arr);
    }
}
