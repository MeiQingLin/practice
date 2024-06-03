package oop09.test01;

    //静态内部类

public class OuterClass {
    private static int x = 1; //静态变量
    private int y = 2;  //实例变量
    public static void test01(){
        System.out.println("静态方法执行了"); //静态方法
    }
    public void test02(){
        System.out.println("实例方法执行了"); //实例方法
    }
    //定义静态内部类
    protected static class StaticInnerClass{
        protected void m1(){
            System.out.println(x);
            // System.out.println(y); 实例变量无法直接访问
            test01();
            // test02(); 实例方法无法直接访问
        }
    }
}
