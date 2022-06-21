package com.softserve.homework.task1.flowerBad;

public class Calculation {
    public double perimeter(double radius){
        double perimeter=(double) 2*Math.PI*radius;
        return perimeter;
    }
    public double square(double radius){
        double square=radius*radius*Math.PI;
        return square;
    }
}
