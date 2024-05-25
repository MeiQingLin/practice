public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setBankName("张三");
        bank.setBalance(100);
        System.out.println(bank.getBalance());
        bank.withDraw(30);
        System.out.println(bank.getBalance());
    }
}
