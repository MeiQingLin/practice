package oop01;

// 获取十个学生成绩,把成绩保存到数组当中,接着遍历每个学生的成绩,最后计算总分和平均分

import java.util.Scanner;

public class ArrayTest01 {
    public static void main(String[] args) {
        java.util.Scanner s = new Scanner(System.in); //接受键盘输入
        double[] studentGrade = new double[10]; //动态初始化一维数组
        double sumGrade = 0; //所有学生成绩和
        double averageSumGrade = 0; //sumGrade的平均分
        //循坏10次,将值输入至数组
        for(int i =0; i < 10; i++){
            System.out.print("请输入第" + (i+1) + "个学生成绩:");
            studentGrade[i] = s.nextDouble();
        }
        for(int i = 0; i < 10; i++){
            System.out.println("第" + (i+1) + "个学生成绩是:" + studentGrade[i]);
            sumGrade = sumGrade + studentGrade[i];
        }
        averageSumGrade = sumGrade / 10;
        System.out.println(sumGrade);
        System.out.println(averageSumGrade);
    }
}
