package stringtest;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * String类的构造方法
 * String(char[] value) 根据字符数组创建一个新的字符串对象
 * String(char[] value, int offset, int count) 根据字符数组的指定部分创建一个新的字符串对象
 * -----------
 * String(byte[] value) 根据byte数组创建一个新的字符串对象,默认采用平台默认的字符集进行解码
 * String(byte[] value, int offset, int length) 根据byte数组的指定部分创建一个新的字符串对象,默认采用平台默认的字符集进行解码
 * -----------
 * String(byte[] value, Charset charset) 根据byte数组和指定的字符集创建一个新的字符串对象
 * String(byte[] value, String charsetName) 根据byte数组和指定的字符集名称创建一个新的字符串对象,需要提前知道byte数组是通过哪个编码方式进行编码得到的
 * -----------
 * String(String original) 通过复制现有字符串创建新的字符串
 */
public class StringTest02 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // String(char[] value)
        char[] cs = new char[]{'我', '是', '小', '梅'};
        String s1 = new String(cs); // 不直接涉及字符编码方式,因为 char 类型在Java中是一个16位的Unicode字符。
        System.out.println(s1);

        // String(char[] value, int offset, int count)
        String s2 = new String(cs, 0, 3); // 从下标0开始,将后续3个字符创建为新的字符串对象
        System.out.println(s2);

        // String(byte[] value)
        byte[] bs = new byte[]{65, 66, 67, 68, 69};
        //这是一个解码的过程,使用平台默认的字符编码方式
        String s3 = new String(bs);
        System.out.println(s3);

        //String(byte[] value, int offset, int length)
        String s4 = new String(bs, 0, 3); // 从下标0开始,将后续3个数字使用平台默认的字符编码方式解码,创建为新的字符串对象
        System.out.println(s4);

        //String(byte[] value, Charset charset)
        //动态获取平台默认的字符编码方式,根据这种字符编码方式对bs数组进行解码
        String s5 = new String(bs, Charset.defaultCharset());
        System.out.println(s5);


        //String(byte[] value, String charsetName)
        //getBytes()方法,将字符串转换为byte数组,这是一个编码的过程
        byte[] bs1 = "我是小梅".getBytes("GBK");

        //乱码的本质就是:在进行编码解码的时候,没有使用同一个字符编码方式
        //这是一个解码的过程,如果编码和解码用的不是同一个字符编码方式,就会出现乱码的现象
        String s6 = new String(bs1, "GBK");
        System.out.println(s6);

        //String(String original)
        //创建一个字符串对象,也是可以这样做的
        //内在的候选方法,不建议使用了,被注解@IntrinsicCandidate标注了
        //这样底层实际会创建两个对象,一个是JVM进行类加载时放到字符串常量池中的"hello",还有一个是在堆内存中new出来的
        String s7 = new String("Hello");
    }
}
