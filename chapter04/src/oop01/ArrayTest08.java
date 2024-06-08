package oop01;

/**
 * java中main()方法里的String[] args有什么作用?
 */

/**
 * 接受命令行参数
 */

/**
 * JVM负责调用main()方法
 * 无论有没有提供参数,JVM都会准备一个String[]类型的一维数组
 * JVM在准备args数组时,并不知道具体的命令行参数是什么,但是它会为args数组提供足够的空间来存储参数
 * 当JVM加载完MyProgram类并准备调用main()方法时,它会解析命令行参数,并将这些命令行参数作为字符串存储在数组中
 * 在调用main()方法时将这个数组作为参数传递
 */

public class ArrayTest08 {
    public static void main(String[] args) {
        System.out.println(args.length);   //当没有提供命令行参数时,JVM会生成一个空数组

        // 如果提供的命令参数是 xxx yyy zzz
        // 那么JVM会将以上命令参数作为字符串,以空格进行拆分,生成一个长度为3的新数组对象,
        for(String arr : args){
            System.out.println(arr);
        }
    }
}
