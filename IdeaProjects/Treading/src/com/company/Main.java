package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Task1 task1 = new Task1();
       Task2 task2  = new Task2();


        Thread thread1 = new Thread( task1);
        thread1.start();
        Thread thread2 = new Thread( task2);
        thread2.start();

    }
}
