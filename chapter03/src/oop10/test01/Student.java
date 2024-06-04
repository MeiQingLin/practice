package oop10.test01;

//重写Object类中的clone()方法
//浅克隆
//凡是参与克隆的对象,都必须实现一个标志接口 Cloneable
//重写clone()方法时,如果想在任何位置都可以使用,将访问控制权限修改为public
//Object类中的clone()方法默认实现是:
//protected native object clone() throws CloneNotSupportedException;
//native 本地方法,底层调用c++写的动态链接库程序(dll程序)
//对新对象操作不会对原对象的数据产生影响

public class Student implements Cloneable{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
