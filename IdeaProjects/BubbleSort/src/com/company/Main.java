package com.company;
public class Main {
    public static void main(String[] args) {
       int[] list = {1,2,3,4,5,6,7,8,9};
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