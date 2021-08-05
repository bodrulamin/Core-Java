package com.schoolmanagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number to check Odd Even");
        int num = sc.nextInt();

        if (num%2==0) System.out.println(num + " is Even");
        else System.out.println(num + " is Odd");

    }
}
