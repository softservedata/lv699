package com.softserve.hw01;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getPerimeter(scanner.nextDouble());
        getArea(scanner.nextDouble());
        scanner.close();

    }

    public static void getPerimeter(double radius) {
        System.out.println(Math.PI * 2 * radius);
    }

    public static void getArea(double radius) {
        System.out.println(Math.PI * Math.pow(radius, 2));
    }
}