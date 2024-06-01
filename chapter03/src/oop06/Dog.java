package oop06;
/*
① 定义一个动物类Animal，属性包括name，age。方法包括display，eat。display方法可以有具体的实现，
显示动物的基本信息。但因为不同的动物会有不同的吃的方式，因此eat方法应该定义为抽象方法，延迟给子类来实现。
② 定义多个子类，例如:XiaoYanZi、Dog、YingWu。分别继承Animal，实现eat方法。
③ 不是所有的动物都会飞，其中只有xiaoYanzi和YingWu会飞，请定义一个Flyable接口，接口中定义fIy()方法。让XiaoYanzi和Yingwu都能飞
④ 不是所有的动物都会说话，其中只有Yingu会说话，请定义一个Speakable接口，接口中定义speak方法。让Yingmu会说话。
⑤ 编写测试程序，创建各个动物对象，调用display方法，eat方法，能飞的动物让它飞，能说话的动物让它说话。
注意:一个类继承某个类的同时可以实现多个接口:class 类 extends 父类 implements 接口A,接口B {}
注意:当某种类型向下转型为某个接口类型时，接口类型和该类之间可以没有继承关系，编译器不会报错的
*/
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println(getName() + "啃骨头");
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }
}
