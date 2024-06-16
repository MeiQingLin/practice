import exception.IllegalAgeException;
import exception.IllegalNameException;

public class ExceptionTest02 {
    public static void main(String[] args) {
        System.out.println("欢迎来到信息注册系统!");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("请输入您的姓名:");
        String name = scanner.next();
        System.out.print("请输入您的年龄:");
        int age = scanner.nextInt();
        //创建服务系统
        UserService userService = new UserService();
        try {
            userService.register(name, age); //这行代码如果发生异常,则这个try块之后的代码不再执行
            System.out.println("---------");
        } catch (IllegalNameException e) {
            System.out.println("您输入的姓名无效!");
        } catch (IllegalAgeException e) {
            System.out.println("您输入的年龄无效!");
        }
    }
}

class UserService{
    /**
     * 用户注册
     * @param name 用户注册姓名
     * @param age 用户注册年龄
     */
    public void register(String name, int age) throws IllegalNameException, IllegalAgeException {
        System.out.println("正在注册中...");
        UserDao userDao = new UserDao();
        userDao.save(name, age);
        System.out.println("注册成功!");
    }

}
class UserDao {
    /**
     * 保存用户信息
     * @param name 用户姓名
     * @param age 用户年龄
     */
    public void save(String name, int age) throws IllegalNameException, IllegalAgeException {
        System.out.println("用户信息保存中...");
        if(name.length() < 6 || name.length() > 12){
            throw new IllegalNameException();
        }
        if(age < 18){
            throw new IllegalAgeException();

        }
        System.out.println("用户信息保存完成!");
    }
}


