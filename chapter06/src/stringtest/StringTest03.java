package stringtest;


import org.junit.jupiter.api.Test;

/**
 *  charAt(int index);返回索引处的char值
 *  length();获取字符串的长度,如果length为0就是空字符串
 *  isEmpty();判断字符串是否为空字符串
 *  equals(Object anObject);判断两个字符串是否相等
 *  equalsIgnoreCase(String anotherString);判断两个字符串是否相等,忽略字符串的大小写
 *  contains(charSequence s);判断当前字符串是否包含某个子字符串
 *  startsWith(String prefix);判断当前字符串是否以某个字符串开头
 *  endsWith(String suffix);判断当前字符串是否以某个字符串结尾
 *  compareTo(String antherString);按照字典顺序比较两个字符串的小大
 *  compareIgnore(String str);按照字典顺序比较两个字符串的大小,比较时忽略大小写
 *  int indexOf(String str):获取当前字符串中某个子字符串第一次出现处的下标
 *  int indexOf(String str, int fromIndex):从fromIndex下标处向右搜索,获取当前字符串中某个字符串第一次出现的下标
 *  int lastIndexOf(String str):获取当前字符串中某个字符串最后一次出现处的下标
 *  int lastIndexOf(String str, int fromIndex):从fromIndex下标处向左搜索,获取当前字符串中某个字符串第一次出现的下标
 */
public class StringTest03 {
    @Test
    public void testCharAt(){
        String s1 = "abcdefg";
        char c1 = s1.charAt(2);
        System.out.println(c1); // c
    }
    @Test
    public void testLength(){
        String s2 = "abcd";
        System.out.println(s2.length()); // 4
    }
    @Test
    public void testIsEmpty(){
        String s3 = "";
        String s4 = "ab";
        System.out.println(s3.isEmpty()); // true
        System.out.println(s4.isEmpty()); // false
    }
    @Test
    public void testEquals(){
        String s5 = "abc";
        String s6 = "abcde";
        String s7 = "abc";
        System.out.println(s5.equals(s6)); // false
        System.out.println(s5.equals(s7)); // true
    }
    @Test
    public void testEqualsIgnoreCase(){
        String s8 = "Java";
        String s9 = "java";
        System.out.println(s8.equalsIgnoreCase(s9)); // true
    }
    @Test
    public void testContains(){
        String s10 = "abcdefg";
        //底层用到了indexOf()方法
        System.out.println(s10.contains("bcd")); // true
        System.out.println(s10.contains("ce")); // false
    }
    @Test
    public void testStartsWith(){
        String s11 = "abcde";
        System.out.println(s11.startsWith("abc")); // true
        System.out.println(s11.startsWith("bcd")); // false
    }
    @Test
    public void testEndsWith(){
        String s12 = "abcde";
        System.out.println(s12.endsWith("cde"));
        System.out.println(s12.endsWith("cd"));
    }
    @Test
    public void testCompareTo(){
        String s13 = "abcdf";
        String s14 = "abcde";
        System.out.println(s13.compareTo(s14)); // 1
    }
    @Test
    public void testCompareToIgnoreCase(){
        String s15 = "ABC";
        String s16 = "abd";
        System.out.println(s15.compareToIgnoreCase(s16)); // -1
    }
    @Test
    public void testIndexOf(){
        String s17 = "abcdefgdeh";
        System.out.println(s17.indexOf("def")); // 3
        System.out.println(s17.indexOf("de",4)); //从e开始搜索 结果是下标7
    }
    @Test
    public void testLastIndexOf(){
        String s18 = "abedefgdeh";
        System.out.println(s18.lastIndexOf("de")); // 7
        System.out.println(s18.lastIndexOf("de",3)); //从d开始向左搜索,发现d和d匹配,又拿d后边的e比较,发现e和e也相等,结果是下标3
    }
}