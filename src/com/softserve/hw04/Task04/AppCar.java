package com.softserve.hw04.Task04;

import java.util.Arrays;
import java.util.Scanner;

public class AppCar {
    public static void main(String[] args) {
        Car car1 = new Car("type1", 1994, 1.8);
        Car car2 = new Car("type2", 1986, 2.0);
        Car car3 = new Car("type3", 2010, 2.2);
        Car car4 = new Car("type4", 2005, 1.8);
        Car [] cars = {car1, car2, car3, car4};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter year of production ");
        int year = scanner.nextInt();
        scanner.close();

        isCarAvailable(cars,year);


    }
    public static void isCarAvailable(Car[] cars , int year) {
        Arrays.sort(cars);
        for (Car car:cars) {
            if (car.getYearOfProduction() == year) {
                car.getDisplay();
            }
        }
    }
}
