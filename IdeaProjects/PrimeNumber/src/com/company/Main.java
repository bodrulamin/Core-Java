package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num to check prime ");
        int num = sc.nextInt();

        PrimeChecker pc = new PrimeChecker(num);
        boolean isPrime = pc.getPrime();
        System.out.println("");
        if (isPrime)
            System.out.println(num + " it is prime");
        else
            System.out.println(num + " it is not prime");
    }
}