package oop01;

// 设计一个学生类(student)，拥有姓名、年龄、性别三个属性(属性类型你可以自定)，
// 并包含获取/设置这些属性的方法。在设置年龄时需要做出一些限制:年龄不能为负数，
// 如果年龄超过了范围(比如超过了120岁)，则输出一个错误信息。

public class Student {
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 120) {
            System.out.println("年龄超过设置范围");
            return;
        }
        if (age < 0) {
            return;
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
