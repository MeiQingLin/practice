package oop09.test02;

//实例内部类

public class OuterClass {
    private static int x = 1; //静态变量
    private int y = 2;  //实例变量
    public static void test01(){
        System.out.println("静态方法执行了"); //静态方法
    }
    public void test02(){
        System.out.println("实例方法执行了"); //实例方法
    }
    //定义实例内部类
    public class InnerClass{
        public void m1(){
            System.out.println(x);
            System.out.println(y);
            test01();
            test02();
        }
    }
}
