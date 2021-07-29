package com.company;

public abstract class Student {
   String name;
   int classLevel;
   int roll;
   public abstract void joined();
   public abstract void studying();
   public abstract void left();

   public void printStudentInfo(){

      System.out.println("____________________________________");
      System.out.printf("|%-10s|%-10s|%-10s|","name","class","roll");
      System.out.println();
      System.out.printf("|%-10s|%-10d|%-10d|",name,classLevel,roll);
   }
}
