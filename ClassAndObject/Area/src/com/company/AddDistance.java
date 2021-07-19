package com.company;

public class AddDistance {

    public static double feet;

    public AddDistance(double inch) {

        double currentFeet = 0.0833333 * inch;
        feet += currentFeet;

    }


}
