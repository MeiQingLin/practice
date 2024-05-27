package oop02;

// 设计一个学生选课系统，有两个类，一个是学生类(Student)，一个是课程类(Course)。
// 学生类包含姓名、学号、已选课程三个属性，课程类包含课程名称、课程编号、所属学院、授课老师、课程学分五个属性。
// 需要设计学生选课和退课的方法。再设计一个打印某学生具体的选课信息的方法。

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("张三", "1234567");
        Course course = new Course("计算机网络", "1", "计院", "王老师", "2");
        s1.takeCourse(course);
        s1.display();
        s1.dropC(course);
        s1.display();
    }
}
