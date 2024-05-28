package oop04.work02;

/*
创建一个名为'Person'的类，在其中定义方法"greet()"，用于问候对方。
在此基础上，创建一个名为'EnglishPerson'的子类和一个名为'chinesePerson'子类分别复写"greet()"方法，
分别使用英文和中文问候对方。
在main方法中，创建一个名为people的数组，
添加一个'EnglishPerson'对象和一个ChinesePerson`对象，使用`greet()方法向对方问候。
*/

public class EnglishPerson extends Person {
    @Override
    public void greet() {
        System.out.println("Hello");
    }
}
