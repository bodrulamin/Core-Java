package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email");
        String email = sc.nextLine();
        String regex = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,6}$";
        if (email.matches(regex)) System.out.println("valid mail");
        else System.out.println("Invalid email");
    }
}