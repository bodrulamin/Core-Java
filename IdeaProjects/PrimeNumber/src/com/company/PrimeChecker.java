package com.company;
class PrimeChecker {
    int number;
    public PrimeChecker(int number){
        this.number = number;
    }

    public boolean getPrime(){
        if (number<2) return false;
        for (int i = 2; i < number; i++) {
           if (number%i==0) return false;
        }
        return true;
    }
}