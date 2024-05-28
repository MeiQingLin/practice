package oop03;

// 初级懒汉式单例模式
public class Single {
    private String name;
    //3.定义一个静态变量,在类加载时初始化
    private  static Single instance = null;

    //1.将构造方法私有化
    private Single(String name) {}

    //2.定义一个公开的静态方法,用来获取单例对象
    public static Single getInstance(){
        if(instance == null){
            instance = new Single("Single");
        }
        return instance;
    }
}
