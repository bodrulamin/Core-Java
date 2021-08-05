package com.company;

public class Main {
    public static void main(String[] args) {
        // write your code here

        int[] arr = {654, 64, 894894, 8, 489, 44, 64, 649, 98, 4, 984, 4, 64, 948};
// bubble sort
        boolean needNextPass = true;
        for (int i = 1; i < arr.length && needNextPass; i++) {

            needNextPass = false;
            for (int j = 0; j < arr.length - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int large = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = large;
                    needNextPass = true;
                }
            }
        }

        int inbl = 0;
        int incl = 0;

        int[] arr2 = {654, 64, 894894, 8, 489, 44, 64, 649, 98, 4, 984, 4, 64, 948};

        System.out.println(arr.toString());
        System.out.println(arr2.toString());
        for (int i = 1; i < arr2.length; i++) {
            int currentItem = arr2[i];
            int j;
            for (j = i - 1; j >= 0 && arr2[j] > currentItem; j--) {
                arr2[j + 1] = arr2[j];
                incl++;

            }
            arr2[j + 1] = currentItem;
        }
// bubble sort end
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}