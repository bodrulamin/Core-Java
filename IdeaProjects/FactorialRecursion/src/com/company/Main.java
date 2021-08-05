package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
      // 5
        int fac = factorial(n);
        System.out.println(fac);

        // n * (n-1) * (n-1-1) * (n-1-1-1)

    }

    private static int factorial(int n) {
        System.out.print(n + " ");
        if(n==0) return 1;


        return n * factorial(n-1);
       //       5 * 4 * 3 * 2 * 1;
    }


}
