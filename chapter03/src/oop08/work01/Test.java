package oop08.work01;

// 重写toString()方法

public class Test {
    public static void main(String[] args) {
        Student student = new Student("小梅", 18, "男");
        System.out.println(student);
        System.out.println(student.toString());
        student = null;
        System.out.println(student); // null
        // System.out.println(student.toString()); // 空指针异常
    }
}
