package oop03;

public class Student {
    //学生姓名
    private String name;
    //学生学号
    private int no;
    //学生出生日
    private String birth;
    //学生性别
    private String sex;
    //学生点化
    private String tel;

    public Student(){

    }

    public Student(String name, String birth,  String sex, String tel) {
        this.birth = birth;
        this.name = name;
        this.sex = sex;
        this.tel = tel;
    }

    public Student(String name, int no, String birth, String sex, String tel) {
        this.name = name;
        this.no = no;
        this.birth = birth;
        this.sex = sex;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "学生:" + name + "\t学号:" + no + "\t出生日:" + birth + "\t性别:" + sex + "\t联系方式:" + tel;
    }
}
