package oop09.test02;

public class InnerClassTest {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
        innerClass.m1();
    }
}
