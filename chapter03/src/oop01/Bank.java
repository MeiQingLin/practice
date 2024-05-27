package oop01;

// 设计一个银行卡类(card)，拥有持卡人姓名、卡号、余额三个属性，
// 实现构造方法、取款、存款、查询余额等方法。
// 在实现取款和存款方法时，需要使用this关键字来区分对象的属性和方法的参数

public class Bank {
    private String bankName;
    private double balance;
    private String accountNumber;

    public Bank(String bankName, double balance, String accountNumber) {
        this.bankName = bankName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public Bank() {
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0){
            this.balance += amount;
            System.out.println("您成功存款" + amount + "元");
        }
        if (amount < 0){
            System.out.println("存的钱不能是负数");
            return;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0){
            this.balance -= amount;
            System.out.println("您成功取走" + amount + "元");
        }
        if (amount < 0){
            System.out.println("取的钱不能是负数");
            return;
        }
    }

    public void display() {
        System.out.println(bankName + "\n" + balance + "\n" + accountNumber);
    }
}
