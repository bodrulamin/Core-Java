package com.schoolmanagement;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
	// write your code here
        int[][] ma = {
                {12,1,4,6,7,},
                {2,4,57,8,6},
                {8,2,45,3,6}
        };
        for (int i = 0; i < ma.length; i++) {
            Arrays.sort(ma[i]);
            for (int j = 0; j < ma[i].length; j++) {
                System.out.print(ma[i][j]+ " ");
            }
            System.out.println();
        }
    }
}