package stringtest;

import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * getBytes(); 将字符串转换成字节数组。其实就是对字符串进行编码,默认按照系统默认字符集
 * getBytes(String charsetName); 将字符串按照指定字符集转换成字节数组
 * getBytes(Charset charsetName); 将字符串按照指定字符集转换成字节数组
 * char[] toCharArray(); 将字符串转换成字符数组
 * String toLowerCase(); 转小写
 * String toUpperCase(); 转大写
 * String concat(String str); 进行字符串拼接操作
 * String subString(int beginIndex); 从指定下标beginIndex处截取子字符串
 * String subString(int beginIndex, int endIndex); 从指定下标beginIndex处截取字符串,到指定下标endIndex处结束,不包含endIndex
 * String trim(); 去除字符串前后空白(只能去除ASCII码中的空白和制表符)
 * String strip(); 去除字符串前后空白(支持所以编码形式的空白。 \u3000是全角空白,可以将其去除)
 * String stripLeading(); 去除字符串前空白
 * String stripTrailing(); 去除字符串后空白
 */
public class StringTest04 {
    @Test
    public void testGetBytes() throws UnsupportedEncodingException {
        String s1 = "abcd";
        //getBytes()
        byte[] bytes1 = s1.getBytes();
        for (byte b : bytes1) {
            System.out.println(b); //97 98 99 100
        }

        //getBytes(String charsetName)
        byte[] bytes2 = s1.getBytes("GBK");
        for (byte bs : bytes2) {
            System.out.println(bs); //97 98 99 100
        }

        //getBytes(Charset charsetName)
        byte[] bytes3 = s1.getBytes(StandardCharsets.UTF_8);
        for (byte b1 : bytes3) {
            System.out.println(b1); //97 98 99 100
        }
    }

    @Test
    public void testToCharArray() {
        String s2 = "abcde";
        char[] charArray = s2.toCharArray();
        for (char c : charArray) {
            System.out.println(c); // a b c d e
        }
    }

    @Test
    public void testUpperCase() {
        String s3 = "aBcdEfff";
        System.out.println(s3.toUpperCase()); // ABCDEFFF
    }

    @Test
    public void testLowerCase() {
        String s4 = "ABDcddEG";
        System.out.println(s4.toLowerCase()); // abdcddeg
    }

    @Test
    public void testConcat() {
        String s5 = "ab";
        String s6 = "cd";
        String s7 = null;
        System.out.println(s5.concat(s6)); // abcd
        //+可以对null拼接,不会出现空指针异常,直接将null变成字符串了
        System.out.println(s5 + s7); // abnull
        //concat不能对null拼接,会出现空指针异常
        System.out.println(s5.concat(s7));

    }

    @Test
    public void testSubstring() {
        String s7 = "http://www.baidu.com";
        System.out.println(s7.substring(7)); // www.baidu.com
        System.out.println(s7.substring(7, 10)); // www
    }

    @Test
    public void testTrim() {
        String s8 = "     ab   dc        ";
        System.out.println("------>" + s8.trim() + "<-------"); // ------>ab   dc<-------
        System.out.println(s8); //      ab   dc
    }

    @Test
    public void testStrip() {
        //\u3000是全角空白
        String s9 = "\u3000\u3000\u3000\u3000\u3000\u3000ab\u3000\u3000cd\u3000\u3000\u3000\u3000";
        System.out.println("------>" + s9.strip() + "<--------"); // ------>ab　　cd<--------
        System.out.println(s9);
    }
    @Test
    public void testStripLeading(){
        String s10 = "\u3000\u3000\u3000\u3000ab\u3000\u3000cdssd\u3000\u3000dds\u3000\u3000\u3000\u3000";
        System.out.println("------->" + s10);
        System.out.println("------->" + s10.stripLeading());
    }
    @Test
    public void testStripTrailing(){
        String s10 = "\u3000\u3000\u3000\u3000ab\u3000\u3000cdssd\u3000\u3000dds\u3000\u3000\u3000\u3000";
        System.out.println(s10 + "<-------");
        System.out.println(s10.stripTrailing() + "<------");
    }
}
