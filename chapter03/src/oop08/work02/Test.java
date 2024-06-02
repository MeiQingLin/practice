package oop08.work02;

// 重写toString()方法和equals()方法

public class Test {
    public static void main(String[] args) {
        //验证重写的toString()方法
        Address address1 = new Address("河南", "古吕");
        User user1 = new User("小美", address1);
        System.out.println(user1.toString());
        Address address2 = new Address("河南", "古吕");
        User user2 = new User("小美", address2);


        //验证重写的equals()方法
        System.out.println(user1.equals(user2));
    }
}
