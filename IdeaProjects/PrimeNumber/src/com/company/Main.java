package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter a num to check prime ");
        System.out.println("Enter a num to check prime ");
        System.out.println("Enter a num to check prime ");
        PrimeChecker pc = new PrimeChecker(num);
        boolean isPrime = pc.getPrime();
        System.out.println("");
        if (isPrime)
            System.out.println("it is prime");
        else
            System.out.println("it is not prime");
    }
}