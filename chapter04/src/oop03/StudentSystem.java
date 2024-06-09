package oop03;

import java.util.Random;

/*
1.程序启动时,读取一个预设的学生数组，其中已经保存了学生信息(包括学生姓名、学号、出生日期、性别、联系方式等)
2.程序提供以下操作选项:
        显示所有学生的信息
        通过学号查找学生的信息
        添加新的学生信息
        修改学生信息
        删除学生信息
        退出程序
3、添加新的学生信息时，要求输入学生所有信息，并自动添加到学生数组中，学号自动生成，不能与已有学生的学号重复。
4、修改学生信息时，提示用户输入要修改的学生的学号，然后允许用户修改该学生的信息(包括姓名、出生日期、性别、联系方式等)。
5.删除学生信息时，提示用户输入要删除的学生的学号，并将该学生从学生数组中删除。
6.修改、添加和删除学生信息后，重新显示所有学生的信息。
*/
public class StudentSystem {
    private Student[] student = new Student[3];

    public StudentSystem() {
        student[0] = new Student("张三",1,"1999-1-1","男","19911111111");
        student[1] = new Student("李四",2,"1992-1-1","男","19922222222");
        student[2] = new Student("王五",3,"2001-1-1","女","20022222222");
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    //显示全部学生信息
   public void display(){
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i]);
        }
   }

   //通过学号查找学生信息
    public void searchByNo(int no){
        for (int i = 0; i < student.length; i++) {
            if(student[i].getNo() == no){
                System.out.print("学号" + no + "对应的信息是:");
                System.out.println(student[i].toString());
            }
        }
    }

    //添加新的学生信息
    public void addStudent(String name, String birth, String sex, String tel){
        Student[] temp = new Student[student.length+1];
        System.arraycopy(student, 0, temp,0, student.length);
        student = temp;
        student[student.length-1] = new Student(name, birth, sex, tel);
        Random random = new Random();
        //将新添加学生的学号随机生成,不能与之前学生的学号重复
        while(true){
            student[student.length-1].setNo(random.nextInt(student.length + 1));
                if(student[student.length - 1].getNo() == (student.length) ){
                    return;
                }
        }
    }

    //修改学生信息
    public void changeStudent(int no){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        for(int x = 0; x < student.length; x++){
            if(student[x].getNo() == no){
                System.out.println("您将对学生" + student[x].getName() + "的信息进行修改\n" + "1.姓名 2.出生日 3.性别 4.联系方式,请输入数字选择您要修改的信息:");
                int choice = scanner.nextInt();
                switch(choice){
                    case 1 -> {
                        String name = student[x].getName();
                        System.out.print("请输入你希望的值:");
                        String changeName = scanner.next();
                        student[x].setName(changeName);
                        System.out.println("修改成功," + name + "->" + changeName);
                    }
                    case 2 -> {
                        String birth = student[x].getBirth();
                        System.out.print("请输入你希望的值:");
                        String changeBirth = scanner.next();
                        student[x].setBirth(changeBirth);
                        System.out.println("修改成功," + birth + "->" + changeBirth);
                    }
                    case 3 -> {
                        String sex = student[x].getSex();
                        System.out.print("请输入你希望的值:");
                        String changeSex = scanner.next();
                        student[x].setSex(changeSex);
                        System.out.println("修改成功," + sex + "->" + changeSex);
                    }
                    case 4 -> {
                        String tel = student[x].getTel();
                        System.out.print("请输入你希望的值:");
                        String changeTel = scanner.next();
                        student[x].setTel(changeTel);
                        System.out.println("修改成功," + tel + "->" + changeTel);
                    }
                }
            }
        }
    }

    //删除学生信息
    public void deleteStudent(int no){
        for(int x = 0; x < student.length; x++){
            if(student[x].getNo() == no){
                student[x].setName("null");
                student[x].setNo(0);
                student[x].setBirth("null");
                student[x].setSex("null");
                student[x].setTel("null");
            }
        }
    }
}
