package com.SoftServe.edu.hw3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first country's standard units: ");
        double c1 = sc.nextDouble();
        System.out.println("Enter second country's standard units: ");
        double c2 = sc.nextDouble();
        System.out.println("Enter third country's standard units: ");
        double c3 = sc.nextDouble();
        System.out.println("Enter how long (minutes) was that call with "+ c1 + " standard unit: ");
        double t1 = sc.nextDouble();
        System.out.println("Enter how long (minutes) was that call with "+ c2 + " standard unit: ");
        double t2 = sc.nextDouble();
        System.out.println("Enter how long (minutes) was that call with "+ c3 + " standard unit: ");
        double t3 = sc.nextDouble();
        double total1 = c1*t1;
        double total2 = c2*t2;
        double total3 = c3*t3;
        double totalAll = total1+total2+total3;
        System.out.println("Your total for first country: " + total1 + "\nYour total for second country: "
        + total2 + "\nYour total for third country: " + total3 + "\nGeneral total: " + totalAll);


    }
}
