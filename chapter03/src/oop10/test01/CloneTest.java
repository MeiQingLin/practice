package oop10.test01;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student xiaoGao1 = new Student("高跃", 105);
        // xiaoGao.clone();
        // 无法使用,因为Object类中clone()方法是protected,只能本类,同包,子类中可以调用
        // 所以需要我们在Student类中重写clone()方法

        //重写之后
        // Student xiaoGao2 = xiaoGao1.clone();
        // 要用Object类型接收返回值,因为clone()的返回值是Object类型,也可以将返回值强转成Student类型

        Student xiaoGao2 = (Student) xiaoGao1.clone();
        System.out.println(xiaoGao1);
        System.out.println(xiaoGao2);
        System.out.println(xiaoGao1.getName()); // 原对象的值
        System.out.println(xiaoGao1.getAge());  // 原对象的值
        System.out.println(xiaoGao2.getName()); // 克隆的新对象的值
        System.out.println(xiaoGao2.getAge());  // 克隆的新对象的值

        //更改新对象的值,观察原对象是否变化
        xiaoGao2.setName("小梅");
        System.out.println("原对象的name:" + xiaoGao1.getName());
        System.out.println("克隆的新对象的name:" + xiaoGao2.getName());

        //可以发现操作新对象,不会对原对象的数据产生影响
    }
}
