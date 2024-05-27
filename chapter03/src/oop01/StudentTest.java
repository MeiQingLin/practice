package oop01;

// 设计一个学生类(student)，拥有姓名、年龄、性别三个属性(属性类型你可以自定)，
// 并包含获取/设置这些属性的方法。在设置年龄时需要做出一些限制:年龄不能为负数，
// 如果年龄超过了范围(比如超过了120岁)，则输出一个错误信息。

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");
        student.setAge(22);
        student.setGender("男");
        System.out.println(student.getName() + " " + student.getAge() + " " + student.getGender());
        student.setAge(130);
    }
}
