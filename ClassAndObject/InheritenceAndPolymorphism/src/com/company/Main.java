package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Rectangle r = new Rectangle();
        r.width = 10;
        r.length = 15;
        printDetails(r);


        Square sc = new Square(5);
        printDetails(sc);

    }

    public static void printDetails(Rectangle r){
        System.out.println("Length " + r.length + "    width " + r.width);
    }

}
