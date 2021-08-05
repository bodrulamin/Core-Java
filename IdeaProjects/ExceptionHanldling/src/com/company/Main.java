package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try {
            int result = getResult(a, b);
        } catch (ArithmeticException exception) {
            System.out.println("Divisor cannot be zero");
        }
    }

    private static int getResult(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisor is zero. What????");
        }
        return a / b;
    }
}
