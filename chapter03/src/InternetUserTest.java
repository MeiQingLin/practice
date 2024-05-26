/*
定义一个网络用户类，构造方法的参数输入，
要处理的信息有用户id、用户密码、
email地址。在建立类的实例时，把以上三个信息都作为
其中用户id和用户密码是必须的，缺省的email地址是用户id加上字符串"@gmail.com'
*/

public class InternetUserTest {
    public static void main(String[] args) {
        InternetUser m = new InternetUser("m", "123");
        System.out.println(m.getId());
        System.out.println(m.getPassword());
        System.out.println(m.getEmail());
    }
}
