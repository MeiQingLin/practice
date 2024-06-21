package stringtest;


/**
 * String对象的intern()方法
 * 将字符串对象放入字符串常量池中,并返回常量池中的字符串引用。
 * 如果字符串常量池中已经存在相同内容的字符串,则直接将池中的字符串地址返回
 * 如果字符串常量池中不存在相同内容的字符串,则将这个字符串对象放到字符串常量池中并返回地址
 */
public class StringTest01 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "edf";
        String s3 = s1 + s2;
        String s4 = "abcedf";
        //将字符串s1 + s2放入字符串常量池中,发现有相同内容的字符串"abcedf",将"abcedf"对象的地址返回，s3这个引用的值没有变!
        String s5 = s3.intern();
        System.out.println(s5 == s3); //false  此时s3和s5的值已经不是指向同一个对象了
        System.out.println(s4 == s3); //false  这里s4和s5指向的对象不同,一个指向在字符串常量池中的对象,一个指向在堆中的对象
        System.out.println(s4 == s5); //true   这里s4和s5指向都是字符串常量池中的"abcedf"
        String s8 = "h";
        String s7 = "hh" + s8; //这里的s7指向的对象在堆中

        //发现字符串常量池中没有相同内容的字符串,将s7引用指向的对象放入字符串常量池中,s7这个引用的值变了!
        String s6 = s7.intern();
        System.out.println(s6 == "hhh"); //true
        System.out.println(s7 == "hhh"); //true


    }

}
