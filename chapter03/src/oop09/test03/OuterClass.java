package oop09.test03;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

//局部内部表
public class OuterClass {
    private static int x = 1; //静态变量
    private int y = 2;  //实例变量
    public static void test01(){
        System.out.println("静态方法执行了"); //静态方法
    }
    public void test02(){
        System.out.println("实例方法执行了"); //实例方法
    }

    //在实例方法中,可以直接访问实例相关数据和静态相关数据
    public void test(){
        int i = 100; //局部变量
        //定义局部内部表
        class InnerClass1{
            public void print(){
                System.out.println(i);
                System.out.println(x);
                System.out.println(y);
                test01();
                test02();
            }
        }
        InnerClass1 innerClass = new InnerClass1();
        innerClass.print();
    }

    //在静态方法中,可以直接访问静态数据,但无法直接访问实例数据
    public static void test03(){
        int i = 100; //局部变量
        //定义局部内部表
        class InnerClass2{
            public void print(){
                System.out.println(i);
                System.out.println(x);
                //System.out.println(y); 访问实例变量
                test01();
                //test02(); 调用实例方法
            }
        }
        InnerClass2 innerClass = new InnerClass2();
        innerClass.print();
    }
}
