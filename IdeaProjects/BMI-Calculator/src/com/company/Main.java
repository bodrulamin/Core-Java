package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Weight in KG");
        double kg = sc.nextDouble();
        System.out.println("Enter Height in inch");
        double feet = sc.nextDouble();

        BMI bmi = new BMI("Bodrul Amin", 25,kg,feet);

        System.out.println(bmi.getBMI());

        System.out.println("The man/women's BMI status is " + bmi.getStatus());
    }
}
