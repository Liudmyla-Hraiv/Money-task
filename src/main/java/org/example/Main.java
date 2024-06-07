package org.example;

public class Main {
    public static void main(String[] args) {
        int S1= 100; // $ deposit
        int V= 5; // interest rate  per year
        int S2 =200; //$ need received
        // Count how long it be.
        /*  s1+(s1*v/100) => 1 year
            s1(1 + v/100)^n = s2  => N years
            (1 + v/100)^n = s2/s1
            n = log(s2/s1) / log (1 + v/100)
        */
        double x = Math.log((double) S2 /S1);
        double y= Math.log (1+ (double) V /100);
        System.out.println(Math.round(x/y)); // years
    }
}
