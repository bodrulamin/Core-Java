package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter numbers (comma separeted)");
        Scanner scanner = new Scanner(System.in);

        String stringN = scanner.nextLine();
        String[] numberStrings = stringN.split(",");
        int[] nums = new int[numberStrings.length];

        for (int i = 0; i < numberStrings.length; i++) {
            nums[i] = Integer.valueOf(numberStrings[i]);
        }
        System.out.print("the max is ");
        System.out.println(findMax(nums));

    }

    private static int findMax(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
           if(nums[i] > max) max = nums[i] ;
        }
        return max;
    }
}
