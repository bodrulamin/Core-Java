package com.company;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    public static final double meter_per_inch = 0.0254;



    public BMI(String name, double weight, double height) {
       this(name,20,weight,height);
    }

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public double getBMI(){
        double meter = meter_per_inch*height;
        return Math.round(weight/(meter*meter));
    }

    public String getStatus(){
        double bmi = getBMI();
        if (bmi<18.5) return "Underweight";
        else if(bmi<25) return "Normal";
        else if(bmi<30) return "Overweight";
        else return "Obese";

    }
}
