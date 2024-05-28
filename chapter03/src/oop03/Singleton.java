package oop03;

// 初级饿汉式单例模式

public class Singleton {
    private String name;
    // 3.定义一个静态的变量,在类加载时,变量初始化
    private static Singleton s = new Singleton("张三");



    // 1.将构造方法私有化
    private Singleton(String name) {
        this.name = name;
    }

    // 2.定义一个公开的,静态的方法,用来获取单例对象

    public static Singleton getInstance() {
        return s;
    }


}
