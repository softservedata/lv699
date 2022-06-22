package com.softserve.hw01;

import java.util.Scanner;

public class Task1 {
    public static void main(java.lang.String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the radius of the bed: ");
        int radius = scn.nextInt();

        double perimeter = 2 * Math.PI * radius;
        System.out.println("The perimeter of the flower bed is " + perimeter);

        double area = Math.PI * radius * radius;
        System.out.println("The area of the flower bed is " + area);
    }
}
