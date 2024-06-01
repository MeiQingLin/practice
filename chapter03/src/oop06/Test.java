package oop06;

public class Test {
    public static void main(String[] args) {
        Animal  xYanZi = new XiaoYanZi("小三",2);
        xYanZi.display();
        xYanZi.eat();
        ((Flyable)xYanZi).fly();
        Animal yWu = new YingWu("小四", 3);
        yWu.display();
        yWu.eat();
        ((Flyable)yWu).fly();
        ((Speakable)yWu).speak();
        Animal dog = new Dog("小五", 4);
        dog.display();
        dog.eat();
    }
}
