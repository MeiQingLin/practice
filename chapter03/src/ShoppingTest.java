public class ShoppingTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("John");
        customer.setBirth("1999-12-10");
        customer.setGender(true);
        customer.setTel("10086");

        customer.pay(100);
        customer.shopping(200);
    }
}
