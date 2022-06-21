package com.softserve.hw01;

import java.util.Scanner;

public class Circle {
    public static void main (String [] args) {
        double perimetr, radius, area;
        System.out.println("Please input the radius");
        Scanner scan = new Scanner(System.in);
        radius = scan.nextDouble();
        scan.close();

        perimetr = 2*3.14*radius;
        area = 3.14*radius*radius;

        System.out.println("Radius = "+ radius + " cm");
        System.out.println("Perimetr = "+ perimetr + " cm");
        System.out.println("Area = "+ area + " cm");

    }

}
