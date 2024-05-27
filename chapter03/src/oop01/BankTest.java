package oop01;

// 设计一个银行卡类(card)，拥有持卡人姓名、卡号、余额三个属性，
// 实现构造方法、取款、存款、查询余额等方法。
// 在实现取款和存款方法时，需要使用this关键字来区分对象的属性和方法的参数

public class BankTest {
    public static void main(String[] args) {
        Bank a = new Bank("张三", 19.5, "111112222");
        a.display();
        a.deposit(100);
        a.deposit(-10);
        a.display();
        a.withdraw(100);
        a.withdraw(-10);
        a.display();
    }
}
