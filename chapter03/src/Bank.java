public class Bank {
    private String bankName;
    private double balance;

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
        if (balance < 0){
            System.out.println("余额不能小于0");
            return;
        }
        this.balance = balance;
    }

    public void withDraw(double amount) {
        if (amount < 0) {
            System.out.println("您输入的钱不合法");
            return;
        }
        if (amount > this.balance) {
            System.out.println("您的余额不足");
            return;
        }
        this.setBalance(getBalance() - amount);

    }
}
