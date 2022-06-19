package com.SoftServe.edu.hw1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your radius: ");
        double radius = sc.nextDouble();
        double circleLength = 2 * Math.PI * radius;
        double circleSquare = Math.PI * Math.pow(radius,2);
        System.out.println("Perimeter: " + circleLength + "\nArea: " + circleSquare);
    }
}
