package oop04.work04;

/*
设计一个简单的员工管理系统，包含以下类:
Employee类:定义员工的基本属性，包括姓名、部门、工资等，并实现方法getSalary()用于返回工资。
HourlyEmployee 类:通过继承Employee类，实现新的属性和方法，包括时薪和工作小时数，并重写父类的getSalary()方法，计算出按照时薪计算的工资
SalariedEmployee类:通过继承Employee类，实现新的属性和方法，包括月薪和工作天数，并重写父类的getSalary()方法，计算出按照月薪计算的工资。
CommissionedEmployee类:通过继承Employee类，实现新的属性和方法，包括佣金比例和销售额，并重写父类的getSalary()方法，计算出按照销售额和佣金比例计算的工资。
在主方法中，实例化多个Employee、Hour lyEmployee、salariedEmployee和CommissionedEmployee对象，分别计算他们的工资并输出。
*/


public class SalariedEmployee extends Employee{
    private double monthSalary;
    private int workingDay;

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    public int getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(int workingDay) {
        this.workingDay = workingDay;
    }

    public SalariedEmployee(double monthSalary, int workingDay) {
        this.monthSalary = monthSalary;
        this.workingDay = workingDay;
    }

    @Override
    public double getSalary() {
        return (monthSalary / 30) * workingDay;
    }
}
