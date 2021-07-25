package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int sum = 0;

        Scanner sc = new Scanner(System.in);
        int input = -1;
        while (input != 0) {
            
            if (input == -1) {
                input = 0;
            }

            sum += input;
            System.out.println("Sum =" + sum + " | Enter a number to add");
            input = sc.nextInt();
            if (input < 0) break;
        }
        System.out.println("Sum is " + sum);
    }
}
