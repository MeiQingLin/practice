package oop05;

public class Person implements Comparable{
    int age;
    String name;
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public Person(){}

    @Override
    public String toString() {
        return this.name + "--" + this.age;
    }

    @Override
    public boolean equals(Object obj) {
        return this.age == ((Person)obj).age && this.name.equals(((Person)obj).name);
    }

    /*
    根据年龄排序
    @Override
    public int compareTo(Object o) {
        return this.age - ((Person)o).age;
    }
    */

    //根据名字排序
    @Override
    public int compareTo(Object o) {
        return this.name.compareTo(((Person)o).name);
    }
}
