package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email Address");

        String email = sc.nextLine();
        if (email.contains("@")){
            System.out.println("Email is correct");
        }else
            System.out.println("Incorrect Email");
    }
}
