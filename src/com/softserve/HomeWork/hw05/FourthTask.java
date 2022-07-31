package com.softserve.HomeWork.hw05;

//Create class Car with fields type, year of production and engine capacity. Create and initialize four instances of class Car. Display cars
//        certain model year  (enter year in the console);
//        ordered by the field year.


import com.softserve.OtherExamples.Car;
import com.softserve.PracticalTask.pt04.Weekday;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class FourthTask implements Comparable<FourthTask>{
    private int year;
    private double capacity;
    public FourthTask() {
        this.year = 0;
        this.capacity = 0.0;
    }

    public FourthTask(int year, double capacity) {
        this.year = year;
        this.capacity = capacity;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {

        return "Displays cars:"+
                " year of production: " + year +
                " engine capacity:" + capacity +
                ' ';
    }

    @Override
    public int compareTo(FourthTask car) {

        return year - car.getYear();
    }
}

class appCar {
    public static void main(String[] args) {
        FourthTask[] car = new FourthTask[4];
        car[0] = new FourthTask(2012, 1.6);
        car[1] = new FourthTask(2010, 1.8);
        car[2] = new FourthTask(2016, 2.0);
        car[3] = new FourthTask(2014, 1.5);

        for (int i = 0; i < car.length; i++) {

            Arrays.sort(car);
            System.out.println(car[i].toString());
        }

      //  public void input() {
            int whatYear;
            FourthTask yearProduct;

            Scanner scan = new Scanner(System.in);
            System.out.print("please select the year of release: 2010, 2012, 2014, 2016:");
            whatYear = scan.nextInt();

            switch (whatYear) {
                case 2010:

                    yearProduct = car[0];
                    System.out.print(yearProduct);
                    break;
                case 2012:
                    yearProduct = car[1];
                    System.out.print(yearProduct);
                    break;
                case 2014:
                    yearProduct = car[2];
                    System.out.print(yearProduct);
                    break;

                case 2016:
                    yearProduct = car[3];
                    System.out.print(yearProduct);
                    break;
                default:
                    System.out.println("you can select only the following years: 2010, 2012, 2014, 2016:");

            }

        }

    }





