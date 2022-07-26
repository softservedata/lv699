package com.softserve.hw05.Car;

import java.util.Calendar;
import java.util.Scanner;

public class AppCar {
    public static void main(String[] args) {
        Car car1 = new Car("Sedan", 2015, 2.0);
        Car car2 = new Car("Muscle Car", 1973, 5.0);
        Car car3 = new Car("Minivan", 2019, 2.5);

        Car[] cars = {car1, car2, car3};

    // Car sorting by year
        for (int i = 0; i < cars.length - 1; i++){
            if (cars[i].getYear() > cars[i+1].getYear()){
                Car temp = cars[i];
                cars[i] = cars[i+1];
                cars[i+1] = temp;
            }
        }

    // car seek by year of manufacture
        Scanner scn = new Scanner(System.in);
        System.out.print("Please print the year of the car: ");
        int year = scn.nextInt();

        System.out.println(Car.yearCheck(year));

        for (Car car : cars){
            if (car.getCarByYear(year) != null) {
                System.out.println(car.getCarByYear(year));
            }
        }

        if (Car.getAvailableCars() == 0) {
            System.out.println("We don't have cars manufactured in " + year + '.');
        }

    // Sorted cars printed
        System.out.println("Available cars in our autopark: ");
        for (Car car : cars){
            System.out.println(car.toString());
        }

    }
}
