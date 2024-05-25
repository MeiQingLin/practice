public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(18);
        user.setName("张三");
        user.setSal(9000);

        System.out.println(user.getAge());
        System.out.println(user.getName());
        System.out.println(user.getSal());

        user.raise(1000);
        System.out.println(user.getSal()); // 10000

        user.raise(1);
        System.out.println(user.getSal()); // 10000
    }
}
