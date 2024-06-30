package stringtest;

//获取两个字符串中最大相同的子字符串

public class StringTest08 {
    public static void main(String[] args) {
        String s1 = "jsadfegwIMportimportjsmqlee";
        String s2 = "jsadIMportimportmqlee";


        //存储最大相同子字符串的长度和末尾下标
        int start = 0, maxLength = 0;
        //利用循环对两字符串的字母比对位置进行定位
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                //记录相同子字符串的长度
                int k = 0;
                //第一次循环进来时,两个字符串都是首字母的位置
                //如果s2的首字母和s1不匹配,继续下一个字母与s1的首字母进行匹配
                //在这期间如果匹配成功,就让s2的下一个字母继续与s1的下一个字母进行匹配
                while (maxLength < (s1.length() - i) && maxLength < (s2.length() - j) && (i + k) < s1.length() && (j + k) < s2.length() && s1.charAt(i + k) == s2.charAt(j + k)) {
                   k++;
                }
                if (maxLength < k) {
                    maxLength = k;
                    start = i;
                }
            }
        }
        System.out.println(s1.substring(start, start + maxLength));
    }
}
