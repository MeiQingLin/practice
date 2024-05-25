public class User {
    private String name;
    private int age;
    private int sal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        if(sal < 800){
            System.out.println("工资不能低于800");
            return;
        }
        this.sal =  sal;
    }

    public void raise(int sal){
        if(sal < 0){
            System.out.println("您输入的数字不合法");
            return;
        }
        if((this.getSal() + sal) > 10000){
            System.out.println("涨薪后该员工sal不能高于10000");
            return;
        }
        this.setSal(this.getSal() + sal);

    }



}
