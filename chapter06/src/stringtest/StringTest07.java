package stringtest;

// 获取指定字符串在整个字符串中出现的次数

public class StringTest07 {
    public static void main(String[] args) {
        String s1 = "abcdjavaassdgjavasdavbfjava";
        //统计字符串中java出现的次数
        //计数器
        int count = 0;
        int index = 0;

        //index = indexOf方法的return + 1是为了保证下次起始位置跳过已找到的子字符串
        while((index = s1.indexOf("java", index) + 1) != 0){
            //找到了 +1
            count++;
        }
        System.out.println(count);
    }
}
