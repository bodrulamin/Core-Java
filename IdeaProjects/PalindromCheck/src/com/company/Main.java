package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check Palindrome");
        int n = scanner.nextInt();

        String nums = String.valueOf(n);

        if (isPalindrome(nums))
        System.out.println(nums + " is palindrome");
        else
            System.out.println(nums + " is not palindrome");
    }

    public static boolean isPalindrome(String nums) {
        char[] chars = nums.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            char a = chars[chars.length-i-1];
            reversed.append(a);
        }
        if (nums.equals(reversed.toString())) return true;
        else return false;
    }

}

