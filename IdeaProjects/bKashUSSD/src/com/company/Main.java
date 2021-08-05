package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    private static final int userpass = 1234;
    static Scanner sc = new Scanner(System.in);
    static Msg msg = new Msg();
    private static int balance = 0;
    static String fname = "balance.txt";

    public static void main(String[] args) {
        balance = getBalance();
        System.out.print("Enter bKash USSD ");
        String ss = sc.nextLine();
        if (ss.equals("*247#"))
            mainMenu();
        else alert("Wrong USD");
    }

    private static int getBalance() {
        StringBuilder sb = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(fname);

            int c = 0;
            while ((c = fileReader.read()) != -1) {
                sb.append((char) c);
            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
        int b = 0;
        try{
            b = Integer.parseInt(sb.toString());
        }catch (NumberFormatException numberFormatException){
            b = 0;
        }

        return b;
    }

    private static void mainMenu() {
        msg.showMainMsg();
        int n = sc.nextInt();
        switch (n) {
            case 1:
                checkBalance();
                break;
            case 2:
                sendMoney();
                break;
            case 3:
                mobileRecharge();
                break;
            case 4:
                cashOut();
                break;
            case 5:
                cashIn();
                break;
            default:
                alert("Invalid input");
                mainMenu();
        }
    }

    private static void alert(String m) {
        String s = "----------------------------";
        System.out.println(s);
        System.out.println(m);
        System.out.println(s);
    }

    private static void checkBalance() {
        if (passValidated()) {
            alert("Current Balance is " + balance);
            mainMenu();
        } else {
            alert("Invalid Password");
            mainMenu();
        }
    }

    private static void mobileRecharge() {
        String mobile = strInput("Enter Mobile number");
        int amount = intInput("Enter Amount");
        if (passValidated()) {
            balance = balance - amount;
            System.out.println(amount + " bdt is recharged to " + mobile + " successfully!");
            balance -= amount;
            alert("Current Balance is " + balance);
            mainMenu();
        } else {
            alert("Invalid Password");
            mainMenu();
        }
    }

    private static void sendMoney() {
        String mobile = strInput("Enter Mobile number");
        int amount = intInput("Enter Amount");
        if (passValidated()) {
            balance = balance - amount;
            System.out.println(amount + " bdt is sent to " + mobile + " successfully!");
            balance -= amount;
            alert("Current Balance is " + balance);
            mainMenu();
        } else {
            alert("Invalid Password");
            mainMenu();
        }
    }

    private static void cashIn() {
        int amount = intInput("Enter Amount");
        if (passValidated()) {
            balance = balance + amount;
            setBalance(balance);
            System.out.println(amount + " bdt cash in  successfully!");
            alert("Current Balance is " + balance);
            mainMenu();
        } else {
            alert("Invalid Password");
            mainMenu();
        }
    }

    private static void setBalance(int balance) {
        try {
            PrintWriter printWriter = new PrintWriter(fname);
            printWriter.write(String.valueOf(balance));
            printWriter.flush();
        } catch (FileNotFoundException e) {

        }

    }

    private static void cashOut() {
        String mobile = strInput("Enter Mobile number");
        int amount = intInput("Enter Amount");
        if (passValidated()) {
            balance = balance - amount;
            System.out.println(amount + " bdt cashout to " + mobile + " successfully!");
            balance -= amount;
            alert("Current Balance is " + balance);
            mainMenu();
        } else {
            alert("Invalid Password");
            mainMenu();
        }
    }

    private static boolean passValidated() {
        int pass = intInput("Enter Password");
        return pass == userpass;
    }

    private static String strInput(String smsg) {
        System.out.println(smsg);
        sc.nextLine();
        return sc.nextLine();
    }

    private static int intInput(String smsg) {
        System.out.println(smsg);
        return sc.nextInt();
    }
}