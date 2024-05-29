package oop05;

/*
定义1个抽象类Shape，
包含属性:name、color、
抽象方法area()，非抽象方法display()
思考为什么area()方法定义为抽象方法? 因为没有确定图形,那么面积计算公式就无法确定,也就是说Shape类中的area方法是无法确定怎么写

定义一个Circle类，继承Shape类，包含一个双精度类型实例变量radius，以及一个构造方法，
该构造方法使用super关键字调用父类Shape的构造方法，来初始化color和name。
Circle类还实现了抽象方法area()，用于计算圆形的面积。定义-个常量类，常量类中定义一个常量用来专门存储圆周率。

定义一个Rectangle类，继承Shape类，包含两个双精度类型实例变量width和height，以及一个构造方法，
该构造方法使用super关键字调用父类Shape的构造方法，来初始化color和name。
Rectangle类还实现了抽象方法area()，用于计算矩形的面积。

5.在程序的main方法中，创建一个Circle对象、一个Rectangle对象，并分别调用它们的display方法，输出结果。调用area()方法输出面积。
*/

public class Test {
    public static void main(String[] args) {
        Shape circle = new Circle("圆", "红色", 3.0);
        Shape rectangle = new Rectangle("长方形", "黑色", 4.0, 3.0);
        circle.display();
        rectangle.display();
        circle.area();
        rectangle.area();
    }
}
