package oop04.work03;

/*
创建一个名为Animal的类，在其中定义方法move()，用于输出动物的移动方式。
在此基础上，创建一个名为cat的子类和一个名为Fish的子类分别复写move()方法、分别输出猫和鱼的移动方式。
在`main方法中、创建一个名为`anima!'的变量，再在运行时分别将它指定为cat和Fish的实例，
然后调用它们的`move()方法。
*/

public class Fish extends Animal{
    @Override
    public void move() {
        System.out.println("鱼在水里游");
    }
}
