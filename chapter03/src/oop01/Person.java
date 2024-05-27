package oop01;

//设计一个人类(Person)，拥有姓名、年龄、性别三个属性，
// 需要统计总人口数。在每次创建Person对象时，需要将总人口数加1，
// 实现这个功能需要使用static关键字

public class Person {
    private static int allPerson = 0;
    private  String name;
    private  int age;
    private  String gender;
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        allPerson++;
    }


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
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static int getAllPerson() {
        return allPerson;
    }
}
