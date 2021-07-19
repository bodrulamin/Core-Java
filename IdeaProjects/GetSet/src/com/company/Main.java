package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student st1 = new Student();

        st1.setId(1263);
        st1.setName("Bodrul amin");
        st1.setAddress("Dhaka");

        int id = st1.getId();
        String name = st1.getName();
        String address = st1.getAddress();

        System.out.println("============================================================");
        System.out.print("id : " + id + " ");
        System.out.print("name : " + name + " ");
        System.out.println("address : " + address + " ");
        System.out.println("============================================================");
    }
}
