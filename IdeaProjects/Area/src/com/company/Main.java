package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
       /* Scanner scanner = new Scanner(System.in);

        System.out.println("Enter inch");
        double inch =  scanner.nextDouble();

        AddDistance addDistance = new AddDistance(inch);

        System.out.println(AddDistance.feet);

        AddDistance addDistance1 = new AddDistance(30);
        System.out.println(AddDistance.feet);

        System.out.println(addDistance1.feet);
        System.out.println(addDistance.feet);
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Mobile Number");
        String mobile = sc.nextLine();
        if (mobile.matches("\\d{5}-\\d{6}")){
            System.out.println("Number valid");
        } else {
            System.out.println("Number invalid");
        }





    }
}






