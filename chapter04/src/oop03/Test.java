package oop03;

public class Test {
    public static void main(String[] args) {
        StudentSystem studentSystem = new StudentSystem();
        System.out.println("欢迎使用学生管理系统");
        System.out.println("请输入不同的编号,使用相对应的功能");
        System.out.println("1.显示所有学生信息");
        System.out.println("2.通过学号查找学生信息");
        System.out.println("3.添加新的学生信息");
        System.out.println("4.修改学生信息");
        System.out.println("5.删除学生信息");
        System.out.println("6.退出程序");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while(true){
            System.out.print("请输入功能编号:");
            int i = scanner.nextInt();
            switch (i) {
                case 1 -> studentSystem.display();
                case 2 -> {
                    System.out.print("请输入您要查询的学生的学号:");
                    int searchNo = scanner.nextInt();
                    studentSystem.searchByNo(searchNo);
                }
                case 3 -> {
                    System.out.print("请输入您要添加的学生的姓名:");
                    String name = scanner.next();
                    System.out.print("请输入您要添加学生的出生日:");
                    String birth = scanner.next();
                    System.out.print("请输入您要添加学生的性别:");
                    String sex = scanner.next();
                    System.out.print("请输入您要添加学生的联系方式:");
                    String tel = scanner.next();
                    studentSystem.addStudent(name, birth, sex, tel);
                    studentSystem.display();
                }
                case 4 -> {
                    System.out.print("请输入您要修改的学生的学号:");
                    int changeNo = scanner.nextInt();
                    studentSystem.changeStudent(changeNo);
                    studentSystem.display();
                }
                case 5 -> {
                    System.out.print("请输入您要删除的学生的学号:");
                    int deleteNo = scanner.nextInt();
                    studentSystem.deleteStudent(deleteNo);
                    studentSystem.display();
                }
                case 6 -> {
                    System.out.println("谢谢使用,下次再见");
                    System.exit(0);
                }
            }
        }

    }
}
