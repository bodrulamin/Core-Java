package com.company;

public class ClassOneStudent extends Student {

    @Override
    public void joined() {
        classLevel = 1;
        System.out.println("ClassOne: student joined");
        printStudentInfo();
    }

    @Override
    public void studying() {
        System.out.println("ClassOne: student studying");
    }

    @Override
    public void left() {
        System.out.println("ClassOne: student left");
    }
}
