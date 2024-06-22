package stringtest;

import org.junit.jupiter.api.Test;

/**
 * static String valueOf(boolean b);
 * static String valueOf(char c);
 * static String valueOf(char[] data);
 * static String valueOf(char[] data, int offset, int count); 从offset下标处开始,连续count个字符后停
 * static String valueOf(double d);
 * static String valueOf(float f);
 * static String valueOf(int i);
 * static String valueOf(long l);
 * static String valueOf(Object obj);
 * 以上所有静态方法valueOf作用是将非字符串类型的数据转换为字符串形式
 *  * static String join(CharSequence d, CharSequence... elements); 将多个字符串以某个分隔符连接
 *  * static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements);
 */
public class StringTest05 {
    @Test
    public void testJoin() {
        String year = "2024";
        String mouth = "01";
        String day = "29";
        System.out.println(String.join("-", year, mouth, day)); // 2024-01-29
    }

    @Test
    public void testValueOf() {
        int a = 111;
        System.out.println(String.valueOf(a)); // 111

        Object obj1 = new Object();
        Object obj2 = null;
        // 在使用valueOf(Object objs)方法时,会判断是否为null,为null返回null,不为空则会调用obj的toString方法
        System.out.println(String.valueOf(obj1)); // java.lang.Object@6e38921c
        System.out.println(String.valueOf(obj2)); // null

        char[] c1 = {'a', 'b', 'c', 'd'};
        //底层调用了String的构造方法
        System.out.println(String.valueOf(c1)); // abcd
        System.out.println(String.valueOf(c1, 0, 3)); // abc 从下标0开始,将连续的3个字符转换为字符串形式
    }
    @Test
    public void testCopyValueOf(){
        char[] c2 = {'a', 'b', 'c', 'd'};
        //底层调用了String的构造方法,和String.valueOf(char[] data)没区别
        System.out.println(String.copyValueOf(c2)); // abcd

        //底层调用了String的构造方法,和String.valueOf(char[] data, int offset, int count)没区别
        System.out.println(String.copyValueOf(c2, 0, 2)); // 从下标0开始,将连续的2个字符转换为字符串形式返回
    }
}
