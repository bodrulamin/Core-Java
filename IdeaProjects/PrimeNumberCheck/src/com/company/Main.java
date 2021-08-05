package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert Number to check prime");
        int n = sc.nextInt();

        if (isPrime(n))
            System.out.println("Prime");
        else System.out.println("not Prime");

    }

    private static boolean isPrime(int n) {
        if(n<2) return false;
        for (int i = 2; i < n ; i++) {
            if (n%i == 0) {
               return false;
            }
        }
        return true;
    }

}
