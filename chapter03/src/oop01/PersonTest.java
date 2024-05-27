package oop01;

//设计一个人类(Person)，拥有姓名、年龄、性别三个属性，
// 需要统计总人口数。在每次创建Person对象时，需要将总人口数加1，
// 实现这个功能需要使用static关键字

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("李四", 19, "男");
        Person person2 = new Person("王五", 12, "女");
        System.out.println("目前总人口是:" + Person.getAllPerson());
    }
}
