package com.SoftServe.edu.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input value for a: ");
        double a = sc.nextDouble();
        System.out.println("Input value for b: ");
        double b = sc.nextDouble();
        double sum = a + b;
        double dif = a - b;
        double prod = a * b;
        double fract = a / b;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + dif);
        System.out.println("Product: " + prod);
        System.out.println("Fraction: "+ fract);
    }
}
