package com.company;
public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 99, 91, 11, 44},
                {0, 10, 9, 9, 11},
                {3, 23, 21, 5, 20},
                {13, 4, 45, 66, 33},
                {11, 0, 1, 20, 56}
        };
        for (int[] ca : arr) {
            BubbleSort(ca);
            for (int ci : ca) {
                System.out.print(ci + " ");
            }
            System.out.println();
        }
    }
    private static void BubbleSort(int[] arr) {
        boolean needNextPass = true;
        for (int i = 1; i < arr.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int larger = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = larger;
                    needNextPass = true;
                }
            }
        }
    }
}