package com.softserve.homework.task1.flowerBad;
import java.util.Scanner;
public class Flower {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number of radius of flower bad");
        double radius=scanner.nextDouble();
        Calculation calculation=new Calculation();
        double perimeter= calculation.perimeter(radius);
        double square = calculation.square(radius);
        System.out.println("Perimeter of flower bad is:"+perimeter);
        System.out.println("Square of flower bad is:"+square);
    }
}
