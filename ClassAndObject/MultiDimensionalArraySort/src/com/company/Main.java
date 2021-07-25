package com.company;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // write your code here
        int[][] ma = {{12, 1, 4, 6, 7}, {2, 4, 57, 8, 6}, {8, 2, 45, 3, 6}};
        for (int i = 0; i < ma.length; i++) {
            int[] ca = ma[i];
            Arrays.sort(ca);
            ma[i] = ca;
            for (int j = 0 ; j<ca.length;j++){
                System.out.print(ca[j] + " ");
            }
            System.out.println("");
        }
    }
}
