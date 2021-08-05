package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to calculate Factorial");
        int num = sc.nextInt();

        int fac = 1;
        for (int i = 2; i <=num; i++) {
            fac *= i;
        }
        System.out.println("10! = " + fac);
    }
}
