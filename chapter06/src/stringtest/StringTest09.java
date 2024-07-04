package stringtest;

import org.junit.jupiter.api.Test;

/**
 * StringBuilder和StringBuffer方法测试
 * append(Type data);
 * delete(int start, int end);
 * deleteChatAt(int index);
 * insert(int offset, String str);
 * replace(int start, int end, String str);
 * reverse();
 * setCharAt(int index, char ch);
 * setLength(int newLength);
 */
public class StringTest09 {
    @Test
    public void testAppend() {
        String s2 = "asbs";
        StringBuilder s1 = new StringBuilder(s2);
        s1.append(123);
        s1.append('a');
        System.out.println(s1); // 123123a
    }

    @Test
    public void testDelete() {
        StringBuilder s3 = new StringBuilder("abc");
        s3.delete(0, 2);
        System.out.println(s3); // c 说明是从下标start开始,下标end结束,但不删除end
    }

    @Test
    public void testDeleteChatAt() {
        StringBuilder s4 = new StringBuilder();
        s4.append("abc");
        //指定删除第一个字符
        s4.deleteCharAt(0);
        System.out.println(s4); // bc
    }

    @Test
    public void testInsert() {
        StringBuilder s5 = new StringBuilder("abc");
        s5.insert(1, 2); // 从下标1位置插入,插入的字符串是2
        System.out.println(s5); // a2bc
    }

    @Test
    public void testReplace() {
        StringBuilder s6 = new StringBuilder("abcdefghrjk");
        s6.replace(1, 5, "12"); // 将下标1到下标5的这一子字符串替换成字符串"12",不包括下标5
        System.out.println(s6);
        System.out.println(s6.length());
    }
    @Test
    public void testReverse(){
        StringBuilder s7 = new StringBuilder("12345678");
        s7.reverse();
        System.out.println(s7); // 87654321
    }
    @Test
    public void testSetCharAt(){
        StringBuilder s8 = new StringBuilder("abcdefg");
        // 将字符串下标2的位置改成3
        s8.setCharAt(2, '3');
        System.out.println(s8); // ab3defg
    }
    @Test
    public void testSetLength(){
        //谨慎使用,会把已有数据抹掉
        StringBuilder s9 = new StringBuilder("11111111");
        System.out.println(s9.length()); // 8
        System.out.println(s9);
        s9.setLength(3);
        System.out.println(s9.length()); // 3
        System.out.println(s9); // 111
    }
}
