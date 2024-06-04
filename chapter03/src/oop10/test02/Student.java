package oop10.test02;

//深克隆
//参与克隆的对象必须实现Cloneable标志接口
//要想在任何位置使用clone()方法,将protected修饰符改为public修饰符
public class Student implements Cloneable{
    private String name;
    private int age;
    private Address addr;

    public Student() {
    }

    public Student(String name, int age, Address addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

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

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }
    public Object clone() throws CloneNotSupportedException {
        //克隆一个新的address对象
        Address address = (Address) this.getAddr().clone();

        //创建一个student对象,通过调用Object类的clone()方法,克隆一个新的对象
        //然后将student对象中的address引用替换成新克隆的address引用,最后返回这个student对象,这样原对象和新对象的address引用就不是指向同一个address对象了
        Student student = (Student) super.clone();
        student.setAddr(address);
        return student;
        //总结,student要克隆,address也要克隆,address克隆后替换掉克隆的新student对象中的address
    }
}
