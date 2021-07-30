package com.company;

public class Main {
    public static void main(String[] args) {
        // write your code here
        int[] list = {2, 5, 4, 6, 78, 99, 85, 77, 45};
        /* int[] sortedList =*/
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static int[] bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int big = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = big;
                    needNextPass = true;
                }
            }
        }
        return list;
    }
}
