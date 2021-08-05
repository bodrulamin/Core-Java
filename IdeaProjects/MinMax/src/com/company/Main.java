package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("length ");
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number " + (i+1));
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
               min = arr[i];
            }
        }
        System.out.println("min " + min);
    }
}