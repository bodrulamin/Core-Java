package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {12,14,15,3,51,2,3,4,9,8};
        BubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }

    public static void BubbleSort(int[] arr){
        boolean needNextPass = true;
        for (int i = 1; i < arr.length && needNextPass; i++) {
           needNextPass = false;
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j]>arr[j+1]){
                    int large = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = large;
                    needNextPass = true;
                }
                    ;


            }

        }

    }
}
