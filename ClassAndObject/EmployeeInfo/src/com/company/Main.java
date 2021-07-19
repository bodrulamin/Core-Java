package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee robert = new Employee();
        robert.setName("Robert");
        robert.setYear(1994);
        robert.setAddress("64C-WallsStreet");

        Employee sam = new Employee();
        sam.setName("Sam");
        sam.setYear(2000);
        sam.setAddress("64D-WallsStreet");

        Employee john = new Employee();
        john.setName("John");
        john.setYear(1999);
        john.setAddress("26B-WallsStreet");

        System.out.println(robert.getTitle());
        System.out.println(robert.getInfo());
        System.out.println(sam.getInfo());
        System.out.println(john.getInfo());

    }
}
