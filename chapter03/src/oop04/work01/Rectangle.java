package oop04.work01;

/*
创建一个名为`shape的类，在其中定义两个属性`length^和`width，
并提供相应的getter和setter方法来进行属性的访问和修改。
在此基础上，创建一个名为'Rectangle`的子类和一个名为`square`的子类，
并分别复写`getArea()方法来计算矩形和正方形的面积，使用多态实现打印出各自的面积。
*/

public class Rectangle extends Shape{
    @Override
    public void getArea() {
        System.out.println("Rectangle area:" + width * length);
    }
}
