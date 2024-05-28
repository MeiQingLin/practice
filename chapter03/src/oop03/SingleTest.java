package oop03;

public class SingleTest {
    public static void main(String[] args) {
        Single s = Single.getInstance();
        Single s1 = Single.getInstance();
        System.out.println(s1==s);
        System.out.println(s);
        System.out.println(s1);
    }
}
