package oop08.work02;

// 重写toString()方法和equals()方法

public class User {
    private String name;
    private Address addr;

    public User() {
    }

    public User(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", addr=" + addr + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(obj == this) return true;
        if(obj instanceof User) {
            User u = (User) obj;
            return this.name.equals(u.getName()) && this.addr.equals(u.getAddr());
        }
        return false;
    }
}
