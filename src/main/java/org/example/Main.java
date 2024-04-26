package org.example;

public class Main {
    public static void main(String[] args) {
        int S1= 100; // $ deposit
        int V= 5; // interest rate  per year
        int S2 =200; //$ need received
        //How many years needed
        double x = Math.log((double) S2 /S1);
        double y= Math.log (1+ (double) V /100);
        System.out.println(Math.round(x/y)); // years
    }
}