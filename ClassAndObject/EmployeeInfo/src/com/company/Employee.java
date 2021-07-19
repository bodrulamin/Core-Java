package com.company;

public class Employee {
    private String name;
    private int year;
    private int salary;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInfo() {
        // String info = name + " " + year + " " + address;
        String info = String.format("%-10s%-9d%-9s", name, year, address);
        return info;
    }

    public String getTitle() {
        String info = String.format("%-10s%-9s%-9s", "Name", "Year", "Address");
        return info;
    }
}
