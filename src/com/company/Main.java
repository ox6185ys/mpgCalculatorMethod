package com.company;
import java.util.*;
public class Main {
    static Scanner stringScanner = new Scanner(System.in);
    static Scanner numberScanner = new Scanner(System.in);
    public static void main(String[] args) {
        /*double miles;
        double gallons;*/
        System.out.println("How many miles have you traveled?");
        double miles = numberScanner.nextDouble();
        System.out.println("How many gallons were used?");
        double gallons = numberScanner.nextDouble();
        double mpg = calculate(miles/ gallons);
        System.out.println(mpg);
    }

    private static double calculate(double mpg) {
        return mpg;
    }
}
