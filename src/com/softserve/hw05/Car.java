package com.softserve.hw05;


import java.util.Arrays;

public class Car {
    private int year_of_production;
    private double engine_capacity;
    public Car() {
        year_of_production=0;
        engine_capacity=0.0;
    }

    public Car(int year_of_production, double engine_capacity) {
        this.year_of_production = year_of_production;
        this.engine_capacity = engine_capacity;
    }

    public int getYear_of_production() {
        return year_of_production;
    }

    public void setYear_of_production(int year_of_production) {
        this.year_of_production = year_of_production;
    }

    public double getEngine_capacity() {
        return engine_capacity;
    }

    public void setEngine_capacity(double engine_capacity) {
        this.engine_capacity = engine_capacity;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "year_of_production=" + year_of_production +
                ", engine_capacity=" + engine_capacity +
                '}';
    }
    public void defaultsort(Car car[]) {
        Car tmp = new Car();
        for (int i = 0; i < car.length - 1; i++) {
            for (int j = i + 1; j < car.length; j++) {
                if (car[i].getYear_of_production() < car[j].getYear_of_production()) {
                    tmp = car[i];
                    car[i] = car[j];
                    car[j] = tmp;
                }
            }
        }
        System.out.println( Arrays.toString(car));
    }


//    Create and initialize four instances of class Car. Display cars
//    certain model year  (enter year in the console);
//    ordered by the field year.

}
