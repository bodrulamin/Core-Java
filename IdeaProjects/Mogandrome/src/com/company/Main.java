package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int sn = scanner.nextInt();
        String s = String.valueOf(sn);

        String rs = "";
        for (int i = 0; i < s.length(); i++) {
            rs += s.charAt(s.length() - 1 - i);
        }

        if (s.equals(rs)) System.out.println("palindrome");
        else System.out.println("not palindrome");


    }
}
