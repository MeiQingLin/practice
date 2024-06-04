package oop10.test02;

//深克隆
//
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address a = new Address("河南");
        Student s1 = new Student("梁超", 18, a);
        Student s01 = (Student) s1.clone();
        //底层返回的是Object,强转成Student接受,也可以用Object接收

        //查看新对象的内存地址
        System.out.println(s01);
        System.out.println(s1.getName());// 原对象的值 梁超
        System.out.println(s1.getAge());// 原对象的值  18
        System.out.println(s1.getAddr().getCity());  // 河南
        System.out.println(s01.getName());// 新对象的值 梁超
        System.out.println(s01.getAge());// 新对象的值  18
        System.out.println(s01.getAddr().getCity()); // 河南

        //操作新对象的数据
        /*
        s01.setName("高跃");
        s01.setAge(12);
        s01.getAddr().setCity("安徽");

        再次输出
        System.out.println("新对象的值" + s01.getName()); 新对象的值  高跃
        System.out.println("新对象的值" + s01.getAge()); 新对象的值  12
        System.out.println("新对象的值" + s01.getAddr().getCity());  新对象的值 安徽
        System.out.println("原对象的值" + s1.getName()); 原对象的值  梁超
        System.out.println("原对象的值" + s1.getAge()); 原对象的值  18
        System.out.println("原对象的值" + s1.getAddr().getCity()); 原对象的值 安徽
        */
        //运行发现对新对象的基本数据类型操作不会影响原对象的数据
        //对新对象的引用数据类型操作就会影响到原对象的数据(String例外,因为String类是别人已经写好的了 浅克隆中已证明)

        //为什么呢？因为引用里存放的是对象的内存地址,你是对内存地址里的数据进行操作
        //而原对象和新对象引用的值虽说不同,但指向的却都是同一个对象
        //更改完后再来一次
        s01.setName("高跃");
        s01.setAge(12);
        s01.getAddr().setCity("安徽");
        System.out.println("新对象的值" + s01.getName()); //新对象的值 高跃
        System.out.println("新对象的值" + s01.getAge()); //新对象的值  12
        System.out.println("新对象的值" + s01.getAddr().getCity()); // 新对象的值 安徽
        System.out.println("原对象的值" + s1.getName()); //原对象的值 梁超
        System.out.println("原对象的值" + s1.getAge()); //原对象的值 18
        System.out.println("原对象的值" + s1.getAddr().getCity()); // 河南
    }
}
