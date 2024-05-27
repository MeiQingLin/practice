package oop02;

// 设计一个学生选课系统，有两个类，一个是学生类(Student)，一个是课程类(Course)。
// 学生类包含姓名、学号、已选课程三个属性，课程类包含课程名称、课程编号、所属学院、授课老师、课程学分五个属性。
// 需要设计学生选课和退课的方法。再设计一个打印某学生具体的选课信息的方法。

public class Student {
    private String name;
    private String id;
    private Course c;

    public Student() {
    }

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String setId(String id) {
        return this.id = id;
    }

    public Course getC() {
        return c;
    }

    public void setC(Course c) {
        this.c = c;
    }

    public void takeCourse(Course c) {
        this.c = c;
        System.out.println("选课成功,选的课是:" + c.getCourseName());
    }

    public void dropC(Course c) {
        this.c = null;
        System.out.println("退课成功,退的课是:" + c.getCourseName());
    }

    public void display() {
        if (this.getC() != null) {
            System.out.println("学生姓名:" + this.name + "\n" + "学生学号:" + this.id + "\n" + "课程名称:" + this.c.getCourseName() + "\n" + "课程编号:" + this.c.getCourseCode() + "\n" + "所属学院:"
                    + this.c.getCourseXueYuan() + "\n" + "授课老师:" + this.c.getCourseTeacher() + "\n" + "课程学分:" + this.c.getCourseCredit());
        }else {
            System.out.println("该学生没有选择课程");
        }

    }
}
