package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student = new Student(12,"Bodrul");
        student.setPaidFees(5054540);
        student.setPaidFees(5000);


        Teacher teacher = new Teacher(12,"Rakib",50000);
        teacher.setSalary(teacher.getSalary());
        teacher.setSalary(teacher.getSalary());

        System.out.println(student.getTotalPaid());
        System.out.println(teacher.getTotalSalary());
        System.out.println("School earned " +School.totalEarned);
        System.out.println("School spent " +School.totalSpent);


        int remaing = School.totalEarned - School.totalSpent;
        System.out.println("Remaining Fund " + remaing);

    }
}
