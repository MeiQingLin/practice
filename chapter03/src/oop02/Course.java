package oop02;

// 设计一个学生选课系统，有两个类，一个是学生类(Student)，一个是课程类(Course)。
// 学生类包含姓名、学号、已选课程三个属性，课程类包含课程名称、课程编号、所属学院、授课老师、课程学分五个属性。
// 需要设计学生选课和退课的方法。再设计一个打印某学生具体的选课信息的方法。

public class Course {
    private String courseName;
    private String courseCode;
    private String courseXueYuan;
    private String courseTeacher;
    private String courseCredit;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseXueYuan() {
        return courseXueYuan;
    }

    public void setCourseXueYuan(String courseXueYuan) {
        this.courseXueYuan = courseXueYuan;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public String getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(String courseCredit) {
        this.courseCredit = courseCredit;
    }

    public Course(String courseName, String courseCode, String courseXueYuan, String courseTeacher, String courseCredit) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseXueYuan = courseXueYuan;
        this.courseTeacher = courseTeacher;
        this.courseCredit = courseCredit;
    }
}
