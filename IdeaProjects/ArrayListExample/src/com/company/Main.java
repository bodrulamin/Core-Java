package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student1 =  new Student(12,"BodrulAmin", "Dhaka");
        Student student2 =  new Student(13,"Mehedi", "Noakhali");
        Student student3 =  new Student(14,"Hasan", "Mirpur");
        Student student4 =  new Student(15,"Amina", "Chapai nowabganj");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.printf("%-12s%-12s%-12s","ID","NAME","ADDRESS");
        for (Student student : students) {
            System.out.println();
            System.out.printf("%-12s%-12s%-12s",student.id,student.name,student.address);

        }
    }
}
