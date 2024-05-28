package oop04.work04;

/*
设计一个简单的员工管理系统，包含以下类:
Employee类:定义员工的基本属性，包括姓名、部门、工资等，并实现方法getSalary()用于返回工资。
HourlyEmployee 类:通过继承Employee类，实现新的属性和方法，包括时薪和工作小时数，并重写父类的getSalary()方法，计算出按照时薪计算的工资
SalariedEmployee类:通过继承Employee类，实现新的属性和方法，包括月薪和工作天数，并重写父类的getSalary()方法，计算出按照月薪计算的工资。
CommissionedEmployee类:通过继承Employee类，实现新的属性和方法，包括佣金比例和销售额，并重写父类的getSalary()方法，计算出按照销售额和佣金比例计算的工资。
在主方法中，实例化多个Employee、Hour lyEmployee、salariedEmployee和CommissionedEmployee对象，分别计算他们的工资并输出。
*/

public class Test {
    public static void main(String[] args) {
        Employee hourlyEmployee = new HourlyEmployee(30, 10);
        Employee salariedEmployee = new SalariedEmployee(3000, 20);
        Employee commissionedEmployee = new CommissionedEmployee(0.1, 10000);

        System.out.println(hourlyEmployee.getSalary()); // 300
        System.out.println(salariedEmployee.getSalary()); // 2000
        System.out.println(commissionedEmployee.getSalary()); // 1000

    }
}
