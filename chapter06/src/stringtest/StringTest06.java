package stringtest;

import org.junit.jupiter.api.Test;

/**
 * 和正则相关的String类常用方法
 * String replace(CharSequence target, CharSequence replacement);
 * 将当前字符串所有的target替换成replacement,返回一个新的字符串
 * String replaceAll(String regex, String replacement);
 * 将当前字符串所有符合正则表达式regex的替换成replacement
 * String split(String regex);
 * 将当前字符串以某个正则表达式的子字符串进行分割,返回一个字符串数组
 * boolean matches(String regex);
 * 判断当前字符串是否符合正则表达式regex
 */
public class StringTest06 {
    @Test
    public void testReplace() {
        // 没有使用正则表达式的替换
        String s1 = "a-b-c-d-e";
        System.out.println(s1.replace("-", "1")); // a1b1c1d1e
    }

    @Test
    public void testReplaceAll() {
        // 使用了正则表达式的替换
        String s2 = "a1b2c3d4";
        // \d 遇到数字就替换为1
        System.out.println(s2.replaceAll("\\d", "1")); // a1b1c1d1
    }

    @Test
    public void testSplit() {
        String s1 = "2021-1053-3022";
        // 这种写法也是可以的,表示以-进行分隔
        String[] ss = s1.split("-");
        for (String ss1 : ss) {
            System.out.println(ss1); // 2021 1053 3022
        }

        // \d 以数字进行分隔
        String s2 = "java11c++2Oracle";
        String[] s = s2.split("\\d");
        // s数组此时是这样的:{"java", "", "c++", "Oracle"} 为什么会有个""呢
        // 因为第一个数字1分割了,又遇到第二个数字,认为1和1之间有个空字符串""
        System.out.println(s.length); // 4
        for (String ss2 : s) {
            System.out.println(ss2); //java c++ Oracle
        }
    }

    @Test
    public void testMatches() {
        String s3 = "20222105346";
        // 当这个字符串符合 \d+时 返回true \d+表示匹配数字一次或多次
        System.out.println(s3.matches("\\d+")); // true
        // \d?表示匹配数字零次或者一次
        System.out.println(s3.matches("\\d?")); // false

        String s4 = "abddef";
        // 匹配除了 x以外的字符一次
        System.out.println(s3.matches("[^x]")); //false
        // 匹配除了 x以外的字符一次次或者多次
        System.out.println(s3.matches("[^x]+")); // true
    }
}
